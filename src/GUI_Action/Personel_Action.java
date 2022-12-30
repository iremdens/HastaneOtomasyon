/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.PersonelGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author irem
 */
public class Personel_Action implements ActionListener {

    public PersonelGUI login = new PersonelGUI();

    public Personel_Action(PersonelGUI login) {
        this.login = login;
        login.getB1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String adSoyad = login.getT1().getText();
        String tc = login.getT2().getText();
        String tel = login.getT3().getText();
        String eposta = login.getT4().getText();
        String adres = login.getT5().getText();
        String unvan = login.getT6().getText();
        
        File file = new File("‪C:\\Users\\irem\\Documents\\dosya2.txt‪‪");
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
            bWriter.write(adSoyad);
            bWriter.write(tc);
            bWriter.write(tel);
            bWriter.write(eposta);
            bWriter.write(adres);
            bWriter.write(unvan);

            bWriter.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
