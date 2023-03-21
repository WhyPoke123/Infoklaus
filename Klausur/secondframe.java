import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.01.2023
 * @author 
 */

public class secondframe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  public static String uebung = "";
  private JTable jTable1 = new JTable(5, 5);
    private DefaultTableModel jTable1Model = (DefaultTableModel) jTable1.getModel();
    private JScrollPane jTable1ScrollPane = new JScrollPane(jTable1);
  // Ende Attribute
  
  public secondframe() { 
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
    setTitle("Training");
    setResizable(false);
    Container cp = getContentPane();
    cp.setBackground(new Color(48,48,48));
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(8, 8, 75, 25);
    jButton1.setText("Zurueck");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTable1ScrollPane.setBounds(8, 56, 300, 150);
    jTable1.getColumnModel().getColumn(0).setHeaderValue("Title 1");
    jTable1.getColumnModel().getColumn(1).setHeaderValue("Title 2");
    jTable1.getColumnModel().getColumn(2).setHeaderValue("Title 3");
    jTable1.getColumnModel().getColumn(3).setHeaderValue("Title 4");
    jTable1.getColumnModel().getColumn(4).setHeaderValue("Title 5");
    cp.add(jTable1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public secondframe
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new secondframe();
 
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    dispose();
    new ersterversuch();
  } // end of jButton1_ActionPerformed

  // Ende Methoden
} // end of class secondframe
