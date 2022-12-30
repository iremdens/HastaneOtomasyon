/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author irem
 */
public class HastaKaydıGUI {
   Scanner scan = new Scanner(System.in);
   public JFrame fr;
   public JButton btn1;
   public JLabel label1, label2, label3, label4, label5, label6;
   public JTextField t1, t2, t3, t4, t5, t6;
   public JTextArea ta;

    public HastaKaydıGUI( ) {
       create();
    }

    public void create() {
        fr = new JFrame(" HASTA KAYIT ANASAYFA");
       
        btn1 = new JButton("Kaydet");
        btn1.setBounds(350, 300, 80, 30);
        
        label1 = new JLabel("Ad :");
        label2 = new JLabel("Soyad :");
        label3 = new JLabel("TC :");
        label4 = new JLabel("Doğum Yeri :");
        label5 = new JLabel("Doğum Tarihi :");
        label6 = new JLabel("Email :");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        label1.setBounds(250, 55, 200, 30);
        label2.setBounds(250, 100, 200, 30);
        label3.setBounds(250, 140, 200, 30);
        label4.setBounds(250, 180, 200, 30);
        label5.setBounds(250, 220, 200, 30);
        label6.setBounds(250, 260, 200, 30);
        t1.setBounds(350, 60, 200, 20);
        t2.setBounds(350, 105, 200, 20);
        t3.setBounds(350, 145, 200, 20);
        t4.setBounds(350, 185, 200, 20);
        t5.setBounds(350, 225, 200, 20);
        t6.setBounds(350, 265, 200, 20);
        fr.add(btn1);
        fr.add(label1);
        fr.add(label2);
        fr.add(label3);
        fr.add(label4);
        fr.add(label5);
        fr.add(label6);
        fr.add(t1);
        fr.add(t2);
        fr.add(t3);
        fr.add(t4);
        fr.add(t5);
        fr.add(t6);
        fr.setSize(1920, 1080);
        fr.setLayout(null);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JLabel getLabel1() {
        return label1;
    }

    public void setLabel1(JLabel label1) {
        this.label1 = label1;
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

    public JLabel getLabel4() {
        return label4;
    }

    public void setLabel4(JLabel label4) {
        this.label4 = label4;
    }

    public JLabel getLabel5() {
        return label5;
    }

    public void setLabel5(JLabel label5) {
        this.label5 = label5;
    }

    public JLabel getLabel6() {
        return label6;
    }

    public void setLabel6(JLabel label6) {
        this.label6 = label6;
    }

    public JTextField getT1() {
        return t1;
    }

    public void setT1(JTextField t1) {
        this.t1 = t1;
    }

    public JTextField getT2() {
        return t2;
    }

    public void setT2(JTextField t2) {
        this.t2 = t2;
    }

    public JTextField getT3() {
        return t3;
    }

    public void setT3(JTextField t3) {
        this.t3 = t3;
    }

    public JTextField getT4() {
        return t4;
    }

    public void setT4(JTextField t4) {
        this.t4 = t4;
    }

    public JTextField getT5() {
        return t5;
    }

    public void setT5(JTextField t5) {
        this.t5 = t5;
    }

    public JTextField getT6() {
        return t6;
    }

    public void setT6(JTextField t6) {
        this.t6 = t6;
    }

}
