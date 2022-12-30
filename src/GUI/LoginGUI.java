/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import static java.awt.Color.pink;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JPasswordField;
import javax.swing.*;

/**
 *
 * @author irem
 */
public class LoginGUI {

    public JFrame frame;
    public JPanel panel;
    public JButton btn2;
    public JLabel label2, label3;
    public JButton btn3;

    public JTextField tf2, tf1;

    public LoginGUI() {

        create();
    }

    public void create() {
        frame = new JFrame("KULLANICI GİRİŞ ANASAYFA");
        btn2 = new JButton("Giriş");
        panel = new JPanel();
        panel.setSize(1920, 1080);
        panel.getBackground().darker();
        tf1 = new JTextField();
        label2 = new JLabel("Email giriniz");
        label3 = new JLabel("Şifre giriniz");
        tf2 = new JTextField();
        btn3 = new JButton("şifremi unuttum");

        btn3.setBounds(250, 300, 150, 30);
        tf1.setBounds(250, 260, 200, 30);
        btn2.setBounds(250, 330, 80, 30);
        label2.setBounds(250, 170, 200, 30);
        label3.setBounds(250, 230, 200, 30);
        tf2.setBounds(250, 200, 200, 30);

        frame.add(label2);
        frame.add(label3);
        frame.add(tf2);
        frame.add(tf1);
        frame.add(btn2);
        // panel.add(btn3);
        frame.add(panel);

        frame.setSize(1920, 1080);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public JTextField getTf1() {
        return tf1;
    }

    public void setTf1(JTextField tf1) {
        this.tf1 = tf1;
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JLabel getLabel2() {
        return label2;
    }

    public void setLabel2(JLabel label2) {
        this.label2 = label2;
    }

    public JLabel getLabel3() {
        return label3;
    }

    public void setLabel3(JLabel label3) {
        this.label3 = label3;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JTextField getTf2() {
        return tf2;
    }

    public void setTf2(JTextField tf2) {
        this.tf2 = tf2;
    }

}
