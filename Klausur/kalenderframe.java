import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date; // https://codegym.cc/de/groups/posts/java-date-und-calendar
import java.awt.Image;
import javax.swing.table.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.01.2023
 * @author 
 */

public class kalenderframe extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  
  private JLabel jLabel1 = new JLabel();
  private JTable jTable1 = new JTable(5, 7);
    private DefaultTableModel jTable1Model = (DefaultTableModel) jTable1.getModel();
    private JScrollPane jTable1ScrollPane = new JScrollPane(jTable1);
  // Ende Attribute
  
  public kalenderframe() { 
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
    setTitle("Kalender");
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
    jLabel1.setBounds(88, 88, 500, 20);
    jLabel1.setText("");
    cp.add(jLabel1);
    jTable1ScrollPane.setBounds(8, 144, 800, 150);
    jTable1.getColumnModel().getColumn(0).setHeaderValue("Montag");
    jTable1.getColumnModel().getColumn(1).setHeaderValue("Dienstag");
    jTable1.getColumnModel().getColumn(2).setHeaderValue("Mittwoch");
    jTable1.getColumnModel().getColumn(3).setHeaderValue("Donnerstag");
    jTable1.getColumnModel().getColumn(4).setHeaderValue("Freitag");
    jTable1.getColumnModel().getColumn(5).setHeaderValue("Samstag");
    jTable1.getColumnModel().getColumn(6).setHeaderValue("Sonntag");
    cp.add(jTable1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public kalenderframe
  
  public static void main(String[] args) {
    new kalenderframe();
    Calendar calendar = new GregorianCalendar(2017, 0 , 25);
    Date date = calendar.getTime();
    String tageins = "a";
  } // end of main
  
 
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    dispose();
    new ersterversuch();
  } // end of jButton1_ActionPerformed
  // Ende Methoden
} // end of class kalenderframe
