package com.mycompany.fs112b.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Eggi Firman Saputra
 * NIM  : 2022429952
 * Kelas: FS112B (PBO)
 */
public class Dosen extends Manusia {
    protected String nip;
    protected String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    public void setMatakuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa() {
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar matakuliah " + mataKuliah );
    }
        
    @Override   
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
}
