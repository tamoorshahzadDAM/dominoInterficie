/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominointerficie;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author ALUMNEDAM
 */
public class confLayout extends JFrame {

    private static JComboBox opciones;
    private static JLabel txtMessage;
    private static int num;
    private static JPanel panel;

    

    public static void main(String[] args) {
        JFrame frame = new JFrame("Configuracion");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
       
        frame.add(panel);
        
        opciones = new JComboBox();
        txtMessage = new JLabel("Numero de jugadores.");

        panel.add(txtMessage);
        panel.add(opciones);
        
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 30));

        opciones.setModel(new DefaultComboBoxModel(new String[]{" ", "2 Jugadores", "3 Jugadores", "4 Jugadores"}));
        txtMessage.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        opciones.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // txtMessage.setText(opciones.getSelectedItem().toString());
                num = opciones.getSelectedIndex();

                txtMessage.setText(Integer.toString(num));
            }
        });


        switch (num) {
            case 1:

                JLabel nomLabel = new JLabel("Nom: ");
                nomLabel.setBounds(30, 30, 90, 30);
                
                panel.add(nomLabel);

                JTextField nomText = new JTextField(20);
                nomText.setBounds(100, 10, 160, 25);
                panel.add(nomText);

                JLabel nomLabel1 = new JLabel("Nom: ");
                nomLabel1.setBounds(10, 10, 80, 25);
                panel.add(nomLabel1);

                JTextField nomText1 = new JTextField(20);
                nomText1.setBounds(100, 10, 160, 25);
                panel.add(nomText1);

                break;
            case 2:
                JLabel nomLabel2 = new JLabel("Nom: ");
                nomLabel2.setBounds(10, 10, 80, 25);
                panel.add(nomLabel2);

                JTextField nomText3 = new JTextField(20);
                nomText3.setBounds(100, 10, 160, 25);
                panel.add(nomText3);
                
                JLabel nomLabel3 = new JLabel("Nom: ");
                nomLabel3.setBounds(10, 10, 80, 25);
                panel.add(nomLabel3);

                JTextField nomText4 = new JTextField(20);
                nomText4.setBounds(100, 10, 160, 25);
                panel.add(nomText4);

                JLabel nomLabel7 = new JLabel("Nom: ");
                nomLabel7.setBounds(10, 10, 80, 25);
                panel.add(nomLabel7);

                JTextField nomText7 = new JTextField(20);
                nomText7.setBounds(100, 10, 160, 25);
                panel.add(nomText7);

                break;
            case 3:

                JLabel nomLabel5 = new JLabel("Nom: ");
                nomLabel5.setBounds(10, 10, 80, 25);
                panel.add(nomLabel5);

                JTextField nomText5 = new JTextField(20);
                nomText5.setBounds(100, 10, 160, 25);
                panel.add(nomText5);

                JLabel nomLabel6 = new JLabel("Nom: ");
                nomLabel6.setBounds(10, 10, 80, 25);
                panel.add(nomLabel6);

                JTextField nomText6 = new JTextField(20);
                nomText6.setBounds(100, 10, 160, 25);
                panel.add(nomText6);

                JLabel nomLabel8 = new JLabel("Nom: ");
                nomLabel8.setBounds(10, 10, 80, 25);
                panel.add(nomLabel8);

                JTextField nomText8 = new JTextField(20);
                nomText8.setBounds(100, 10, 160, 25);
                panel.add(nomText8);

                JLabel nomLabel9 = new JLabel("Nom: ");
                nomLabel9.setBounds(10, 10, 80, 25);
                panel.add(nomLabel9);

                JTextField nomText9 = new JTextField(20);
                nomText9.setBounds(100, 10, 160, 25);
                panel.add(nomText9);

                break;
            default:
                break;
        }

    }

    private static void placeComponents(JPanel panel, int numjugadors) {
//        switch (numjugadors) {
//            case 1:
//
//                JLabel nomLabel = new JLabel("Nom: ");
//                nomLabel.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel);
//
//                JTextField nomText = new JTextField(20);
//                nomText.setBounds(100, 10, 160, 25);
//                panel.add(nomText);
//                
//                JLabel nomLabel1 = new JLabel("Nom: ");
//                nomLabel1.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel1);
//
//                JTextField nomText1 = new JTextField(20);
//                nomText1.setBounds(100, 10, 160, 25);
//                panel.add(nomText1);
//
//                break;
//            case 2:
//                JLabel nomLabel2 = new JLabel("Nom: ");
//                nomLabel2.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel2);
//
//                JTextField nomText3 = new JTextField(20);
//                nomText3.setBounds(100, 10, 160, 25);
//                panel.add(nomText3);
//                
//                JLabel nomLabel3 = new JLabel("Nom: ");
//                nomLabel3.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel3);
//
//                JTextField nomText4 = new JTextField(20);
//                nomText4.setBounds(100, 10, 160, 25);
//                panel.add(nomText4);
//                
//                JLabel nomLabel7 = new JLabel("Nom: ");
//                nomLabel7.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel7);
//
//                JTextField nomText7 = new JTextField(20);
//                nomText7.setBounds(100, 10, 160, 25);
//                panel.add(nomText7);
//
//                break;
//            case 3:
//                
//                JLabel nomLabel5 = new JLabel("Nom: ");
//                nomLabel5.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel5);
//
//                JTextField nomText5 = new JTextField(20);
//                nomText5.setBounds(100, 10, 160, 25);
//                panel.add(nomText5);
//                
//                JLabel nomLabel6 = new JLabel("Nom: ");
//                nomLabel6.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel6);
//
//                JTextField nomText6 = new JTextField(20);
//                nomText6.setBounds(100, 10, 160, 25);
//                panel.add(nomText6);
//                
//                JLabel nomLabel8 = new JLabel("Nom: ");
//                nomLabel8.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel8);
//
//                JTextField nomText8 = new JTextField(20);
//                nomText8.setBounds(100, 10, 160, 25);
//                panel.add(nomText8);
//                
//                JLabel nomLabel9 = new JLabel("Nom: ");
//                nomLabel9.setBounds(10, 10, 80, 25);
//                panel.add(nomLabel9);
//
//                JTextField nomText9 = new JTextField(20);
//                nomText9.setBounds(100, 10, 160, 25);
//                panel.add(nomText9);
//
//                break;
//            default:
//                break;
//        }
    }

}

//    public static void main(String[] args) {
//		JFrame frame = new JFrame("Configuracion");
//		frame.setSize(300, 150);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		JPanel panel = new JPanel();
//		frame.add(panel);
//		placeComponents(panel);
//
//		frame.setVisible(true);
//	}
//    
//    private static void placeComponents(JPanel panel) {
//        
//        panel.setLayout(null);
//        opciones.addItemListener(new ItemListener() {
//            public void itemStateChanged(ItemEvent e) {
//               // txtMessage.setText(opciones.getSelectedItem().toString());
//            }
//        });
//		panel.setLayout(null);
//
//		JLabel userLabel = new JLabel("User");
//		userLabel.setBounds(10, 10, 80, 25);
//		panel.add(userLabel);
//
//		JTextField userText = new JTextField(20);
//		userText.setBounds(100, 10, 160, 25);
//		panel.add(userText);
//
//		JLabel passwordLabel = new JLabel("Password");
//		passwordLabel.setBounds(10, 40, 80, 25);
//		panel.add(passwordLabel);
//
//		JPasswordField passwordText = new JPasswordField(20);
//		passwordText.setBounds(100, 40, 160, 25);
//		panel.add(passwordText);
//
//		JButton loginButton = new JButton("login");
//		loginButton.setBounds(10, 80, 80, 25);
//		panel.add(loginButton);
//		
//		JButton registerButton = new JButton("register");
//		registerButton.setBounds(180, 80, 80, 25);
//		panel.add(registerButton);
//	}
    

//}
