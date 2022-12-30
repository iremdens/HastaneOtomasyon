/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.HastaKaydıGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author irem
 */
public class HastaKaydı_Action implements ActionListener {

    public HastaKaydıGUI login = new HastaKaydıGUI();

    public HastaKaydı_Action(HastaKaydıGUI login) {
        this.login = login;
        login.getBtn1().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String ad = login.getT1().getText();
        String soyad = login.getT2().getText();
        String tc = login.getT3().getText();
        String dogum_yeri = login.getT4().getText();
        String dogum_tarihi = login.getT5().getText();
        String email = login.getT6().getText();

        File file = new File("C:\\Users\\irem\\Documents\\dosya.txt");
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

    }
}
