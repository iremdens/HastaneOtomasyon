package Entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem
 */
public class HastaKayıt {

    public HastaKayıt() {
    }
    
    

    
    @Override
    public String toString() {
        return "HastaKay\u0131t{" + "tc=" + tc + ", ad=" + ad + ", soyad=" + soyad + ", dogumYeri=" + dogumYeri + ", dogumTarihi=" + dogumTarihi + ", email=" + email + '}';
    }

    public int tc;
    public String ad;
    public String soyad;
    public String dogumYeri;
    public String dogumTarihi;
    public String email;

    public HastaKayıt(int tc, String ad, String soyad, String dogumYeri, String dogumTarihi, String email) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.dogumYeri = dogumYeri;
        this.dogumTarihi = dogumTarihi;
        this.email = email;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumYeri() {
        return dogumYeri;
    }

    public void setDogumYeri(String dogumYeri) {
        this.dogumYeri = dogumYeri;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   
}
