/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUI;

import GUI_Action.Admin_Action;
import GUI_Action.HastaKaydı_Action;
import GUI_Action.Login_Action;
import GUI_Action.Personel_Action;
import GUI_Action.Randevu_Action;

/**
 *
 * @author irem
 */
public class Test {

    /**
     *
     */
    public static void main(String[] args) {
       LoginGUI gui = new LoginGUI();
       
       Login_Action action = new Login_Action(gui);
      //  HastaKaydıGUI hasta = new HastaKaydıGUI();
       // HastaKaydı_Action action1 = new HastaKaydı_Action(hasta);
        // RandevuGUI gui = new RandevuGUI();
        //  Randevu_Action action = new Randevu_Action(gui);
        // AdminGUI gui = new AdminGUI();
       // PersonelGUI giris = new PersonelGUI();
        // Personel_Action action = new Personel_Action(giris);
      //  Admin_Action action = new Admin_Action(gui);
    //  Admin_Action action = new Admin_Action(giris);

    }

}
