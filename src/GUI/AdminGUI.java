/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author irem
 */
public class AdminGUI {

    JFrame fr;
    JButton b1, b2, b3;

    public AdminGUI() {
        create();
    }

    public void create() {
        fr = new JFrame("ADMİN GİRİŞ ANASAYFA");
        b1 = new JButton("PERSONEL EKLE ");
        b2 = new JButton("BRANŞ EKLE");
        b3 = new JButton("PERSONEL LİSTE");
        b1.setBounds(300, 200, 500, 50);
        b2.setBounds(300, 300, 500, 50);
        b3.setBounds(300, 400, 500, 50);

        fr.add(b1);
        fr.add(b2);
        fr.add(b3);

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

    public JButton getB2() {
        return b2;
    }

    public void setB2(JButton b2) {
        this.b2 = b2;
    }

    public JButton getB3() {
        return b3;
    }

    public void setB3(JButton b3) {
        this.b3 = b3;
    }

}
