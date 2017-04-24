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

    private JComboBox opciones;
    private JLabel txtMessage;

    public confLayout() {
        opciones = new JComboBox();
        txtMessage = new JLabel("Numero de jugadores.");

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        opciones.setModel(new DefaultComboBoxModel(new String[]{"2 Jugadores", "3 Jugadores", "4 Jugadores"}));
        txtMessage.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));

        opciones.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                txtMessage.setText(opciones.getSelectedItem().toString());
            }
        });

        add(txtMessage);
        add(opciones);
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new confLayout();
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
//    

