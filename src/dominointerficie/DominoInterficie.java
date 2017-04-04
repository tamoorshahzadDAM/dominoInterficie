/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominointerficie;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author ALUMNEDAM
 */
public class DominoInterficie extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menu, opciones, exit;
    private JMenuItem menuItemJugar, menuItemInfo, menuItemexit;

    private JLabel labelImatge, labelColor;
    private JPanel panelImatge, panelColor;
    private JColorChooser tcc;

    public DominoInterficie() throws HeadlessException {
        configuracio();
        this.pack();
        this.setVisible(true);

    }

    private void configuracio() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 300);
        this.setPreferredSize(new Dimension(300, 300));
        this.setLayout(new BorderLayout());

        menuItemJugar = new JMenuItem("Jugar");
        menuItemJugar.addActionListener(this);
        
        menuItemInfo = new JMenuItem("Informacion");
        menuItemInfo.addActionListener(this);
        
        menuItemexit = new JMenuItem("Salir");
        menuItemexit.addActionListener(this);
      

        menu = new JMenu("Menu");
        opciones = new JMenu("Opciones");
        exit = new JMenu("Salir");
  
        menu.add(menuItemJugar);
        opciones.add(menuItemInfo);
        menu.add(menuItemexit);
        

        menuBar = new JMenuBar();
        menuBar.add(menu);
        menuBar.add(opciones);
        menuBar.add(exit);

        this.setJMenuBar(menuBar);

        this.labelImatge = new JLabel();
        this.labelColor = new JLabel("Color", JLabel.CENTER);
        this.labelColor.setOpaque(true);
        panelColor = new JPanel();
        panelImatge = new JPanel();
        panelColor.add(labelColor);
        panelImatge.add(labelImatge);

        this.getContentPane().add(this.panelColor, BorderLayout.CENTER);
        this.getContentPane().add(this.panelImatge, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    
        String action = e.getActionCommand();

        switch (action) {
            case "Salir":
                System.exit(0);
                
                break;
            
           
        }
    
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DominoInterficie();
            }
        });
    }

}
