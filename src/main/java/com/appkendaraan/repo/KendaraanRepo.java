package com.appkendaraan.repo;

import org.springframework.data.repository.CrudRepository;

import com.appkendaraan.entity.Kendaraan;
import java.util.List;



public interface KendaraanRepo extends CrudRepository<Kendaraan,String> {
List<Kendaraan> findByNoregisOrNama(String keyword1,String keyword2);
    
}
