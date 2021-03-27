package com.mycompany.fs112b.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Eggi Firman Saputra
 * NIM  : 2022429952
 * Kelas: FS112B (PBO)
 */
public class Manusia {
    protected String nama;
    protected int umur;
    
    public String getNama() {
        return nama;
    } 
    
    public void setNama(String nama) {
        this.nama = nama;
    } 
    
    public int getUmur() {
    return umur;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    public void siapaKamu() {
        System.out.println("saya manusia");
    }
}
