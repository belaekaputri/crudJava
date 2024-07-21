package com.appkendaraan.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_kendaraan")
public class Kendaraan {
    //primary key  
    
    @Id 
    private String noregis;
    private String nama;
    private String alamat;
    private String merk;
    private int tahun;
    private int kapasitas;
    private String warna;
    private String bahan;

    public Kendaraan() {
    }


    public String getNoregis() {
        return this.noregis;
    }

    public void setNoregis(String noregis) {
        this.noregis = noregis;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getWarna() {
        return this.warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBahan() {
        return this.bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

   
   
  
}
