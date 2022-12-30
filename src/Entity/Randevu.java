package Entity;


import Entity.HastaKayıt;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author irem
 */
public class Randevu extends HastaKayıt {

    public String Servis;

    public Randevu(int tc, String ad, String soyad, String dogumYeri, String dogumTarihi, String email, String servis) {
        super(tc, ad, soyad, dogumYeri, dogumTarihi, email);
        this.Servis = Servis;
    }

}
