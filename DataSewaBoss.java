/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;
/**
 *
 * @author lenovo
 */
public class DataSewaBoss {
    

    
    private String username;
    private String nama;
    private String jenisLapangan;
    private String tanggalSewa;
    private String jenisHari;
    private String waktuSewa;
    private int harga;
    private String pelunasan;
    
    public DataSewaBoss(String nama, String jenisLapangan, String tanggalSewa, String jenisHari, String waktuSewa, int harga, String pelunasan) {
        this.username = username;
        this.nama = nama;
        this.jenisLapangan = jenisLapangan;
        this.tanggalSewa = tanggalSewa;
        this.jenisHari = jenisHari;
        this.waktuSewa = waktuSewa;
        this.harga = harga;
        this.pelunasan = pelunasan;
    }
    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisLapangan() {
        return jenisLapangan;
    }

    public void setJenisLapangan(String jenisLapangan) {
        this.jenisLapangan = jenisLapangan;
    }

    public String getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(String tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public String getJenisHari() {
        return jenisHari;
    }

    public void setJenisHari(String jenisHari) {
        this.jenisHari = jenisHari;
    }

    public String getWaktuSewa() {
        return waktuSewa;
    }

    public void setWaktuSewa(String waktuSewa) {
        this.waktuSewa = waktuSewa;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getPelunasan() {
        return pelunasan;
    }

    public void setPelunasan(String pelunasan) {
        this.pelunasan = pelunasan;
    }

//    public String toString() {
//        return "DataSewaBoss{" +
//                "nama='" + nama + '\'' +
//                ", jenisLapangan='" + jenisLapangan + '\'' +
//                ", tanggalSewa='" + tanggalSewa + '\'' +
//                ", jenisHari='" + jenisHari + '\'' +
//                ", waktuSewa='" + waktuSewa + '\'' +
//                ", harga=" + harga +
//                ", pelunasan='" + pelunasan + '\'' +
//                '}';
//    }
}


