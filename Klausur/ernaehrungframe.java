import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.LineBorder; //https://stackoverflow.com/questions/25796572/simplest-code-to-round-corners-of-jlabel-in-java

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.01.2023
 * @author 
 */

public class ernaehrungframe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  //public static double kalorienMax = popupquestionframe.kalorien;  
  
  
  private static JLabel jLabel1 = new JLabel();
  private JNumberField jNumberField1 = new JNumberField();
  private JButton jButton2 = new JButton();
  private JLabel jLabel2 = new JLabel();
  // Ende Attribute
  
  public ernaehrungframe() { 
    // Frame-Initialisierung
    super(); 
    
    ImageIcon icon = new ImageIcon("lion.png");
    setIconImage(icon.getImage());
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1280;
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Ernaehrung");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(8, 8, 75, 25);
    jButton1.setText("Zueruck");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    double kalorienMax = popupquestionframe.kalorien;
    jLabel1.setBounds(500, 80, 200, 100);
    jLabel1.setText("" + kalorienMax);
    LineBorder line = new LineBorder(Color.blue, 3, true); // color, thickness, rounded
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setVerticalAlignment(SwingConstants.CENTER);
    jLabel1.setBorder(line);
    cp.add(jLabel1, BorderLayout.CENTER);
    //cp.add(jLabel1);
    jNumberField1.setBounds(112, 300, 75, 20);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jButton2.setBounds(300, 300, 75, 25);
    jButton2.setText("Ok");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel2.setBounds(8, 232, 300, 20);
    jLabel2.setText("Wie viel Kalorien haben Sie heute schon gegessen?");
    cp.add(jLabel2);
    // Ende Komponenten
    
    setVisible(true);
    
  } // end of public ernaehrungframe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new ernaehrungframe();
    //new popupquestionframe();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {  //Zurück Taste
    // TODO hier Quelltext einfügen
    dispose();
    new ersterversuch();
  } // end of jButton1_ActionPerformed
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    double kalorienmax = popupquestionframe.kalorien;
    double kalorienmin = jNumberField1.getDouble();
    jLabel1.setText("" + (kalorienmax - kalorienmin));
    if(kalorienmax < 0)
    {
      jLabel1.setBackground(Color.RED);
    }  
  } // end of jButton2_ActionPerformed

  // Ende Methoden
} // end of class ernaehrungframe
