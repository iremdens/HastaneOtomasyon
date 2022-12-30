package Entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem
 */
public class AdminGiris {

    String adSoyad;
    String email;
    int yas;

    public AdminGiris(String adSoyad, String email, int yas) {
        this.adSoyad = adSoyad;
        this.email = email;
        this.yas = yas;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
    

    public void personelEkle(String adSoyad, String email, int yas) {
        System.out.println(adSoyad+" personeli eklendi");
    }

    public void personelSil() {

    }

    public void BransEkle() {

    }
}
