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
public class BransGUI {

    JFrame fr;
    JLabel l1;
    JTextField t1;
    JButton b1;

    public void create() {
        fr = new JFrame("BRANŞ EKLEME SAYFASI");
        l1 = new JLabel("Branş giriniz :");
        t1 = new JTextField();
        b1 = new JButton("Kaydet");
        l1.setBounds(150, 55, 200, 30);
        t1.setBounds(300, 55, 200, 20);
        b1.setBounds(300, 80, 80, 20);

        fr.add(t1);
        fr.add(l1);
        fr.add(b1);

        fr.setSize(1920, 1080);
        fr.setLayout(null);
        fr.setVisible(true);

    }

    public BransGUI() {
        create();
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

    public JTextField getT1() {
        return t1;
    }

    public void setT1(JTextField t1) {
        this.t1 = t1;
    }

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

}
