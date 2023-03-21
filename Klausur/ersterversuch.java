import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.01.2023
 * @author 
 */

public class ersterversuch extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton4 = new JButton();
  private JLabel jLabel1 = new JLabel();
  
  
  // Ende Attribute
  
  public ersterversuch() { 
    // Frame-Initialisierung
    super();
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1920;
    int frameHeight = 1080;
    
    final Image image = new ImageIcon("gym.jpg").getImage();
    //Bild von https://www.pixelstalk.net/wp-content/uploads/images6/Gym-HD-Wallpaper-Free-download.jpg 
    ImagePanel imagePanel = new ImagePanel(image);
    setContentPane(imagePanel);
    
    ImageIcon icon = new ImageIcon("lion.png");
    //Bild von https://img.icons8.com/color/512/lion.png
    setIconImage(icon.getImage());
    
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("LION");
    setResizable(false);
    Container cp = getContentPane();
    
    
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(1110, 150, 500, 150);
    jButton1.setText("Training");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.setHorizontalAlignment(SwingConstants.CENTER);
    jButton1.setBackground(Color.WHITE);
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(1110, 400, 500, 150);
    jButton2.setText("Ernaehrung");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.setHorizontalAlignment(SwingConstants.CENTER);
    jButton2.setBackground(Color.WHITE);
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton4.setBounds(1110, 650, 500, 150);
    jButton4.setText("Kalender");  
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.setHorizontalAlignment(SwingConstants.CENTER);
    jButton4.setBackground(Color.WHITE);
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
  
    jLabel1.setBounds(930, 100, 60, 100);
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setText("LION");
    cp.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public ersterversuch
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new ersterversuch();
    new logInFrame();
    
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    setVisible(false);
    new trainingframe();
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    setVisible(false);
    //new ernaehrungframe();
    new popupquestionframe();
  } // end of jButton2_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    setVisible(false);
    new kalenderframe();
    
  }
  class ImagePanel extends JPanel {
    private Image image;
    ImagePanel(Image image) {
      this.image = image;
    }
  
    public void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
  }
  // https://www.gutefrage.net/frage/wie-kann-ich-in-javajframe-im-hintergrung-ein-imagebild-setzen#answer-317068067
  }
  // Ende Methoden
} // end of class ersterversuch
