/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.AdminGUI;
import GUI.HastaKaydıGUI;
import GUI.RandevuGUI;
import java.awt.ItemSelectable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author irem
 */
public class Randevu_Action implements ActionListener {

    public RandevuGUI login = new RandevuGUI();
    public AdminGUI giris = new AdminGUI();

    public Randevu_Action() {

    }

    public Randevu_Action(RandevuGUI randevu) {
        this.login = login;
        login.getBtn1().addActionListener(this);
        login.getBtn3().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // String doktor = (String) login.getCb1().getSelectedItem();
        //JOptionPane.showMessageDialog(null, doktor + " ADLI DOKTORDAN  RANDEVU ALINDI");
        Object source = actionEvent.getSource();

        if (source == login.getBtn1()) {
            String ad = login.getT1().getText();
            String soyad = login.getT2().getText();
            String tc = login.getT3().getText();
            String dogum_yeri = login.getT4().getText();
            String dogum_tarihi = login.getT5().getText();
            String email = login.getT6().getText();

            File file = new File("‪C:\\Users\\irem\\Documents\\randevukayıt.txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bWriter = new BufferedWriter(fileWriter);
                bWriter.write(ad);
                bWriter.write(soyad);
                bWriter.write(tc);
                bWriter.write(dogum_yeri);
                bWriter.write(dogum_tarihi);
                bWriter.write(email);
                bWriter.close();

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else if (login.getBtn3() == source) {
            giris.create();
        }

    }

}
