import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 01.02.2023
 * @author 
 */

public class popupquestionframe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  /*public double groesseb = logInFrame.groesse;
  public double gewichtb = logInFrame.gewicht;
  public double alterb = logInFrame.alter; */
  public static double kalorien = 0;
  private JLabel jLabel1 = new JLabel();
  // Ende Attribute
  
  public popupquestionframe() { 
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
    setTitle("");
    setResizable(false);
    Container cp = getContentPane();
    cp.setBackground(new Color(139,137,137));
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(262, 75, 150, 50);
    jButton1.setText("Muskelaufbau");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.setBackground(Color.WHITE);
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(262, 175, 150, 50);
    jButton2.setText("Gewicht halten");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.setBackground(Color.WHITE);
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(262, 275, 150, 50);
    jButton3.setText("Abnehmen/Diät");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.setBackground(Color.WHITE);
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    //Männer: (1 x kg Körpergewicht x 24) x PAL-Faktor (66 + (13,8 x Gewicht in kg) + (5,0 x Größe in cm) - (6,8 x Alter in Jahren)) x PAL-Faktor Frauen: (0,9 x kg Körpergewicht x 24) x PAL-Faktor (655 + (9,5 x Gewicht in kg) + (1,9 x Größe in cm) - (4,7 x Alter in Jahren)) x PAL-Faktor
    jLabel1.setBounds(0, 0, 667, 45);
    jLabel1.setText("Was ist dein Ziel?");
    jLabel1.setForeground(Color.WHITE);
    jLabel1.setBackground(Color.ORANGE);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setVerticalAlignment(SwingConstants.CENTER);
    jLabel1.setOpaque(true);
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public popupquestionframe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new popupquestionframe();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) { //Muskelaufbau 
    // TODO hier Quelltext einfügen
    kalorien = 655.1 + (9.6 * logInFrame.gewicht) + (1.8 * logInFrame.groesse) - (4.7 * logInFrame.alter) + 500;
    
    this.kalorien = kalorien;
    System.out.println(kalorien);
    dispose();
    new ernaehrungframe();
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {  //Gewicht halten 
    // TODO hier Quelltext einfügen
    kalorien = 655.1 + (9.6 * logInFrame.gewicht) + (1.8 * logInFrame.groesse) - (4.7 * logInFrame.alter);
    
    System.out.println(kalorien);
    dispose();
    new ernaehrungframe();
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {          //Abnehmen
    // TODO hier Quelltext einfügen
    
    kalorien = 655.1 + (9.6 * logInFrame.gewicht) + (1.8 * logInFrame.groesse) - (4.7 * logInFrame.alter) - 250;
    System.out.println(kalorien);
    dispose();
    new ernaehrungframe();
  } // end of jButton3_ActionPerformed

  // Ende Methoden
} // end of class popupquestionframe
