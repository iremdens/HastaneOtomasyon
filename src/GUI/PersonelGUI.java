/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author irem
 */
public class PersonelGUI {

    JFrame fr;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5, t6;
    JButton b1;

    public PersonelGUI() {
        create();
    }
    
     public void create() {
        JFrame fr = new JFrame("DOKTOR KAYIT ANASAYFA");
        b1 = new JButton("Kaydet");
        b1.setBounds(300, 350, 80, 30);

        l1 = new JLabel("AD SOYAD :");
        l2 = new JLabel("TC :");
        l3 = new JLabel("TELEFON :");
        l4 = new JLabel("E-POSTA :");
        l5 = new JLabel("ADRES :");
        l6 = new JLabel("ÜNVAN :");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();

        l1.setBounds(200, 80, 200, 30);
        l2.setBounds(200, 120, 200, 30);
        l3.setBounds(200, 160, 200, 30);
        l4.setBounds(200, 200, 200, 30);
        l5.setBounds(200, 240, 200, 30);
        l6.setBounds(200, 280, 200, 30);

        t1.setBounds(350, 80, 200, 30);
        t2.setBounds(350, 120, 200, 30);
        t3.setBounds(350, 160, 200, 30);
        t4.setBounds(350, 200, 200, 30);
        t5.setBounds(350, 240, 200, 30);
        t6.setBounds(350, 280, 200, 30);
        fr.add(b1);
        fr.add(l1);
        fr.add(l2);
        fr.add(l3);
        fr.add(l4);
        fr.add(l5);
        fr.add(l6);

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

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JLabel getL1() {
        return l1;
    }

    public void setL1(JLabel l1) {
        this.l1 = l1;
    }

    public JLabel getL2() {
        return l2;
    }

    public void setL2(JLabel l2) {
        this.l2 = l2;
    }

    public JLabel getL3() {
        return l3;
    }

    public void setL3(JLabel l3) {
        this.l3 = l3;
    }

    public JLabel getL4() {
        return l4;
    }

    public void setL4(JLabel l4) {
        this.l4 = l4;
    }

    public JLabel getL5() {
        return l5;
    }

    public void setL5(JLabel l5) {
        this.l5 = l5;
    }

    public JLabel getL6() {
        return l6;
    }

    public void setL6(JLabel l6) {
        this.l6 = l6;
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
