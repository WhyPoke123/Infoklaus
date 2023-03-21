import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 08.03.2023
 * @author 
 */

public class trainingframe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  public static String uebung1 = "";
  // Ende Attribute
  
  public trainingframe() { 
    // Frame-Initialisierung
    super();
    
    ImageIcon icon = new ImageIcon("lion.png");
    setIconImage(icon.getImage());
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 667;
    int frameHeight = 525;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("trainingframe");
    setResizable(false);
    Container cp = getContentPane();
    cp.setBackground(new Color(139,137,137));
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(125, 75, 150, 75);
    jButton1.setText("Schulter & Arme");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(125, 175, 150, 75);
    jButton2.setText("Brust");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(125, 275, 150, 75);
    jButton3.setText("Bauch");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jLabel1.setBounds(0, 0, 667, 45);
    jLabel1.setText("Welche Muskelgruppe?");
    jLabel1.setForeground(Color.WHITE);
    jLabel1.setBackground(Color.ORANGE);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setVerticalAlignment(SwingConstants.CENTER);                                                                                              
    jLabel1.setOpaque(true);                                                                                                 
    cp.add(jLabel1);
    jButton4.setBounds(375, 75, 150, 75);
    jButton4.setText("Beine");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(375, 175, 150, 75);
    jButton5.setText("Gesaess");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(375, 275, 150, 75);
    jButton6.setText("Ruecken");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public trainingframe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new trainingframe();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    uebung1 = "Hallo1";
    dispose();
    new secondframe();
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    uebung1 = "Hallo2";
    dispose();
    new secondframe();
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    uebung1 = "Hallo3";
    dispose();
    new secondframe();
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    uebung1 = "Hallo4";
    dispose();
    new secondframe();
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    uebung1 = "Hallo5";
    dispose();
    new secondframe();
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    uebung1 = "Hallo6";
    dispose();
    new secondframe();
  } // end of jButton6_ActionPerformed

  // Ende Methoden
} // end of class trainingframe
