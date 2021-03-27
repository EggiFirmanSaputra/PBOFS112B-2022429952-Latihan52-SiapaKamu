package com.mycompany.fs112b.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Eggi Firman Saputra
 * NIM  : 2022429952
 * Kelas: FS112B (PBO)
 */
public class Mahasiswa extends Manusia {
    protected String nim;
    protected String kelas;
    
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang belajar di kelas " + kelas);
    }
    
    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
    }
}
