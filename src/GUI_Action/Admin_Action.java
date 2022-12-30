/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.AdminGUI;
import GUI.BransGUI;
import GUI.PersonelGUI;
import GUI.PersonelListelemeGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author irem
 */
public class Admin_Action implements ActionListener {

    public AdminGUI login = new AdminGUI();
    public PersonelGUI giris = new PersonelGUI();
    public BransGUI log = new BransGUI();
    public PersonelListelemeGUI gui = new PersonelListelemeGUI();

    public Admin_Action(PersonelGUI giris) {
        this.giris = giris;
        login.getB1().addActionListener(this);
        login.getB2().addActionListener(this);
        login.getB3().addActionListener(this);

    }

    public BransGUI getLog() {
        return log;
    }

    public void setLog(BransGUI log) {
        this.log = log;
    }

    public PersonelListelemeGUI getGui() {
        return gui;
    }

    public void setGui(PersonelListelemeGUI gui) {
        this.gui = gui;
    }

    public void setLogin(AdminGUI login) {
        this.login = login;
    }

    public PersonelGUI getGiris() {
        return giris;
    }

    public void setGiris(PersonelGUI giris) {
        this.giris = giris;
    }

    public Admin_Action(AdminGUI login) {
        this.login = login;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == login.getB1()) {
            giris.create();
        }
        if (source == login.getB2()) {
            log.create();

        }

        if (source == login.getB3()) {
            gui.create();

        }

    }

}
