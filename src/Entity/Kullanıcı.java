package Entity;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem
 */
public class Kullanıcı {
    Scanner scan = new Scanner(System.in);
    public String adSoyad;
    public String email;
    public int sifre;
 

    public Kullanıcı(String adSoyad, String email, int sifre) {
        this.adSoyad = adSoyad;
        this.email = email;
        this.sifre = sifre;
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

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
    
}
