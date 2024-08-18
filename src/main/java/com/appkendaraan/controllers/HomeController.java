package com.appkendaraan.controllers;

import com.appkendaraan.entity.Kendaraan;
import com.appkendaraan.service.KendaraanService;
import com.dto.SearchFormData;

import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired 
    private KendaraanService kendaraanService;
    private final static Logger LOGGER = LoggerFactory.getLogger(HomeController.class.getName());


    
    @GetMapping 
    public String home(Model model){ 
        model.addAttribute("searchForm", new SearchFormData());
        model.addAttribute("kendaraan", kendaraanService.findAll());
    return "index"; 
    }


    @GetMapping("/add")
    public String add(Model model){
    model.addAttribute("kendaraan", new Kendaraan()); 
    return ("/add"); 
    }

    @PostMapping("/save")
    public String save( @Valid Kendaraan kendaraan, Model model,BindingResult errors){
        LOGGER.info(kendaraan.toString());
        if (errors.hasErrors())
			return "/add";
        try {
            kendaraanService.addKendaraan(kendaraan); 
            return "redirect:/";
		} catch (DataAccessException e) {
		 	errors.reject("error.object", e.getMessage());
             if (e.getMessage().contains("UK_vd5cle1dneqwdcvyjdautjst")) {
                model.addAttribute("errorMessage", "No Registrasi Tidak Boleh Duplikat!");
                  return "/edit";// 
            }
			LOGGER.error(e.getMessage());
			return "/add";
		}
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
       kendaraanService.deleteById(id);
       return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
       model.addAttribute("kendaraan",kendaraanService.findById(id));
       return "edit"; 
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, Model model) {
       model.addAttribute("kendaraan",kendaraanService.findById(id));
       return "detail"; 
    }

    @PostMapping("/update")
    public String update(  Kendaraan kendaraan, Model model, BindingResult errors){

      LOGGER.info(kendaraan.toString());

      if (errors.hasErrors())
      return "/add";
        try {
            kendaraanService.updateKendaraan(kendaraan);
            return "redirect:/";
        } catch (DataAccessException e) {
            errors.reject("error.object", e.getMessage());
            if (e.getMessage().contains("UK_vd5cle1dneqwdcvyjdautjst")) {
                model.addAttribute("errorMessage", "No Registrasi Tidak Boleh Duplikat!");
                  return "/edit";// 
            }
            LOGGER.error(e.getMessage());
            return "/edit";
        }
      
    }


    @PostMapping("/search")
    public String search(SearchFormData searchFormData, Model model) {
        model.addAttribute("searchForm", searchFormData);
        model.addAttribute("kendaraan", kendaraanService.findByNoregisOrNama(searchFormData.getKeyword1(), searchFormData.getKeyword2()));
        return "index";
    }
    
}
