import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 22.02.2023
 * @author 
 */

public class logInFrame extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JNumberField jNumberField1 = new JNumberField();
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JCheckBox jCheckBox1 = new JCheckBox();
  private JCheckBox jCheckBox2 = new JCheckBox();
  private JNumberField jNumberField2 = new JNumberField();
  public String name = "";
  public static double groesse = 0;
  public static double gewicht = 0;
  public static double alter = 0;
  private JNumberField jNumberField3 = new JNumberField();
  private JButton jButton2 = new JButton();
  private JLabel jLabel7 = new JLabel();
  // Ende Attribute
  
  public logInFrame() { 
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
    setTitle("LogIn");
    setResizable(false);
    
    Container cp = getContentPane();
    cp.setBackground(new Color(139,137,137));
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(280, 350, 75, 25);
    jButton1.setText("Fertig");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(250, 75, 150, 20);
    jTextField1.setText("");
    cp.add(jTextField1);
    jNumberField1.setBounds(250, 175, 75, 20);
    jNumberField1.setDouble(0);
    cp.add(jNumberField1);
    jLabel1.setBounds(0, 0, 667, 45);
    jLabel1.setText("Hallo und herzlich Willkommen zu Lion. Geben Sie bitte"
    + " folgend Ihre Daten ein. ");
    jLabel1.setForeground(Color.WHITE);
    jLabel1.setBackground(Color.ORANGE);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setVerticalAlignment(SwingConstants.CENTER);
    jLabel1.setOpaque(true);
    cp.add(jLabel1);
    jLabel2.setBounds(5, 75, 150, 20);
    jLabel2.setText("Name:");
    cp.add(jLabel2);
    jLabel3.setBounds(5, 125, 150, 20);
    jLabel3.setText("Koerpergroesse (in cm):");
    cp.add(jLabel3);
    jLabel4.setBounds(5, 175, 150, 20);
    jLabel4.setText("Gewicht (in Kg):");
    cp.add(jLabel4);
    jLabel5.setBounds(5, 275, 150, 20);
    jLabel5.setText("Geschlecht:");
    cp.add(jLabel5);
    jCheckBox1.setBounds(250, 275, 100, 20);
    jCheckBox1.setBackground(new Color(139,137,137));
    jCheckBox1.setOpaque(true);
    jCheckBox1.setText("maenlich");
    cp.add(jCheckBox1);
    jCheckBox2.setBounds(250, 300, 100, 20);
    jCheckBox2.setBackground(new Color(139,137,137));
    jCheckBox2.setOpaque(true);
    jCheckBox2.setText("weiblich");
    cp.add(jCheckBox2);
    jNumberField2.setBounds(250, 125, 75, 20);
    jNumberField2.setDouble(0);
    cp.add(jNumberField2);
    jNumberField3.setBounds(250, 225, 75, 20);
    jNumberField3.setDouble(0);
    cp.add(jNumberField3);
    jButton2.setBounds(334, 420, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel7.setBounds(5, 225, 110, 20);
    jLabel7.setText("Alter:");
    cp.add(jLabel7);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public logInFrame
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new logInFrame();
    
  } // end of main
  public void jButton1_ActionPerformed(ActionEvent evt) {
    name = jTextField1.getText(); 
    gewicht = jNumberField1.getDouble();
    groesse = jNumberField2.getDouble();
    alter = jNumberField3.getDouble();
    
    if (name.isEmpty()) {
      jTextField1.setBackground(new Color(255,69,0));
    }
    if(groesse == 0)
    {
      jNumberField2.setBackground(new Color(255,69,0));
    }
    if (alter == 0) {
      jNumberField3.setBackground(new Color(255,69,0));
    }
    if (gewicht == 0) {
      jNumberField1.setBackground(new Color(255,69,0));
    } // end of if
    if (!(jCheckBox1.isSelected() || jCheckBox2.isSelected())) {
      jCheckBox2.setBackground(new Color(255,69,0));
      jCheckBox1.setBackground(new Color(255,69,0));
    } // end of if
    if(alter > 0 && gewicht > 0 && groesse > 0 && !name.isEmpty() && (jCheckBox1.isSelected() || jCheckBox2.isSelected()))
    {
      setVisible(false);
    }   
    
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
      setVisible(false);
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class logInFrame
