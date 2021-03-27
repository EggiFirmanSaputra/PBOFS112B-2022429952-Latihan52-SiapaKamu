package com.mycompany.fs112b.latihan52.siapakamu;

/**
 *
 * @author 
 * Nama : Eggi Firman Saputra
 * NIM  : 2022429952
 * Kelas: FS112B (PBO)
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMatakuliah("PBO");
        System.out.println("NIP DOSEN   : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println();
        
        mhs.setNim("2022429952");
        mhs.setNama("Eggi Firman");
        mhs.setUmur(21);
        mhs.setKelas("PBO");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}