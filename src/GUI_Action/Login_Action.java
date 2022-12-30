/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.LoginGUI;
import GUI.RandevuGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author irem
 */
public class Login_Action implements ActionListener {

    public LoginGUI login = new LoginGUI();
    public RandevuGUI randevu = new RandevuGUI();

    public Login_Action(LoginGUI login) {
        this.login = login;

        login.getBtn2().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sifre = login.getTf1().getText();
        String email = login.getTf2().getText();
        if (email.equals("1234@gmail.com") && sifre.equals("1234")) {
             randevu.create();
             

        } else {
             JOptionPane.showMessageDialog(null, "YANLIŞ ŞİFRE TEKRAR DENEYİN LÜTFEN !!");
            System.out.println("şifreniz veya email yanlış tekrar deneyiniz");
        }
    }

}
