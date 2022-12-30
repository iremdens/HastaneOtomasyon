/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author irem
 */
public class BransEkleGUI {

    JFrame fr;
    JButton btn1;
    JTextField tf1;
    public BransEkleGUI(JFrame fr) {
    }

    public void create() {
        fr = new JFrame("BRANŞ KAYIT EKRANI");
        btn1= new JButton("Ekle");
        tf1 = new JTextField();
        btn1.setBounds(400, 400, 200, 30);
        fr.add(btn1);
        fr.setSize(1920, 1080);
        fr.setLayout(null);
        fr.setVisible(true);

    }
}
