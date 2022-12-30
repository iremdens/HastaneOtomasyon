/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.PersonelListelemeGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author irem
 */
public class PersonelListeleme_Action implements ActionListener {

    public PersonelListelemeGUI login = new PersonelListelemeGUI();

    public PersonelListeleme_Action(PersonelListelemeGUI login) {
        this.login = login;
        login.getB1().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        File f = new File("‪C:\\Users\\irem\\Documents\\dosya1.txt");
        try {

            FileReader file = new FileReader(f);
            BufferedReader input = new BufferedReader(file);

            String personel = input.readLine();
            while (personel != null) {
                System.out.println(personel);
                personel = input.readLine();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
