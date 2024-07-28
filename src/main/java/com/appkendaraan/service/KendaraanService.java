package com.appkendaraan.service;
//import jakarta.validation.Valid;
import com.appkendaraan.entity.Kendaraan;
import com.appkendaraan.repo.KendaraanRepo;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class KendaraanService {
    @Autowired


    private KendaraanRepo repo;

    public Iterable<Kendaraan> findAll(){
        return repo.findAll();
    }

    public void addKendaraan(Kendaraan kendaraan){
        repo.save(kendaraan);
      }
      public void deleteById(String id){
        repo.deleteById(id);
       } 

       public Optional<Kendaraan> findById(String id){
        return repo.findById(id);
    }

    public void updateKendaraan(Kendaraan kendaraan){
      repo.save(kendaraan);
  }

  public List<Kendaraan> findByNoregisOrNama(String keyword1,String keyword2){
    return repo.findByNoregisOrNama(keyword1,keyword2);
  }
    
}
