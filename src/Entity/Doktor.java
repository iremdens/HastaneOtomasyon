package Entity;


import Entity.HastanePersoneli;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem
 */
public class Doktor extends HastanePersoneli implements IUzmanlık {

    String ad;
    String soyad;
    String tc;
    int yas;
    String uzmanlık;

    public Doktor() {
    }

    public Doktor(String ad, String soyad, String tc, int yas, String uzmanlık) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.yas = yas;
        this.uzmanlık = uzmanlık;
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

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getUzmanlık() {
        return uzmanlık;
    }

    public void setUzmanlık(String uzmanlık) {
        this.uzmanlık = uzmanlık;
    }

    @Override
    public void UzmanlıkSahibi() {
        System.out.println("UZMANLIĞI BULUNMAKTADIR"); 
    }

}
