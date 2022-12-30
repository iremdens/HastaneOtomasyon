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
public class PersonelListelemeGUI {

    JFrame fr;
    JButton b1;
    public JLabel label1, label2, label3, label4, label5, label6;
    public JTextField t, t1, t2, t3, t4, t5, t6;

    public PersonelListelemeGUI() {
    }

    public void create() {
        fr = new JFrame("DOKTOR LİSTELEME ANASAYFA");
        b1 = new JButton("Listele");
        b1.setBounds(200, 100, 200, 30);

        fr.add(b1);
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

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
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

    public JTextField getT() {
        return t;
    }

    public void setT(JTextField t) {
        this.t = t;
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
