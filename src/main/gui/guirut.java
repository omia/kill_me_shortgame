package main.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 31.10.2016
  * @author 
  */

public class guirut extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  private JButton jButton3 = new JButton();
  private JButton jButton4 = new JButton();
  private JButton jButton5 = new JButton();
  private JButton jButton6 = new JButton();
  private JButton jButton7 = new JButton();
  private JButton jButton8 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JCheckBox jCheckBox1 = new JCheckBox();
  private JComboBox jComboBox1 = new JComboBox();
    private DefaultComboBoxModel jComboBox1Model = new DefaultComboBoxModel();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JTextArea jTextArea2 = new JTextArea("");
    private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  private JTextField jTextField2 = new JTextField();
  private JTextArea jTextArea3 = new JTextArea("");
    private JScrollPane jTextArea3ScrollPane = new JScrollPane(jTextArea3);
  // Ende Attribute
  
  public guirut(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 568; 
    int frameHeight = 524;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jButton1.setBounds(456, 8, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(456, 48, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jButton3.setBounds(456, 96, 75, 25);
    jButton3.setText("jButton3");
    jButton3.setMargin(new Insets(2, 2, 2, 2));
    jButton3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton3_ActionPerformed(evt);
      }
    });
    cp.add(jButton3);
    jButton4.setBounds(456, 136, 75, 25);
    jButton4.setText("jButton4");
    jButton4.setMargin(new Insets(2, 2, 2, 2));
    jButton4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton4_ActionPerformed(evt);
      }
    });
    cp.add(jButton4);
    jButton5.setBounds(456, 176, 75, 25);
    jButton5.setText("jButton5");
    jButton5.setMargin(new Insets(2, 2, 2, 2));
    jButton5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton5_ActionPerformed(evt);
      }
    });
    cp.add(jButton5);
    jButton6.setBounds(456, 216, 75, 25);
    jButton6.setText("jButton6");
    jButton6.setMargin(new Insets(2, 2, 2, 2));
    jButton6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton6_ActionPerformed(evt);
      }
    });
    cp.add(jButton6);
    jButton7.setBounds(456, 256, 75, 25);
    jButton7.setText("jButton7");
    jButton7.setMargin(new Insets(2, 2, 2, 2));
    jButton7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton7_ActionPerformed(evt);
      }
    });
    cp.add(jButton7);
    jButton8.setBounds(456, 296, 75, 25);
    jButton8.setText("jButton8");
    jButton8.setMargin(new Insets(2, 2, 2, 2));
    jButton8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton8_ActionPerformed(evt);
      }
    });
    cp.add(jButton8);
    jTextField1.setBounds(24, 16, 150, 20);
    cp.add(jTextField1);
    jCheckBox1.setBounds(200, 16, 36, 20);
    jCheckBox1.setText("");
    jCheckBox1.setOpaque(false);
    cp.add(jCheckBox1);
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1.setBounds(248, 16, 150, 20);
    cp.add(jComboBox1);
    jTextArea1ScrollPane.setBounds(24, 88, 136, 300);
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);
    jTextArea2ScrollPane.setBounds(280, 88, 144, 300);
    jTextArea2.setEditable(false);
    cp.add(jTextArea2ScrollPane);
    jTextField2.setBounds(184, 88, 70, 44);
    jTextArea3.setEditable(false);
    cp.add(jTextField2);
    jTextArea3ScrollPane.setBounds(192, 160, 64, 108);
    cp.add(jTextArea3ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public guirut
  
  // Anfang Methoden
  

  
  public void jButton1_ActionPerformed(ActionEvent evt) {
   if (jTextField1.getText()!="" || jTextField2.getText()!="" ){

   }
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton2_ActionPerformed

  public void jButton3_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton3_ActionPerformed

  public void jButton4_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton4_ActionPerformed

  public void jButton5_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton5_ActionPerformed

  public void jButton6_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton6_ActionPerformed

  public void jButton7_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton7_ActionPerformed

  public void jButton8_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
  } // end of jButton8_ActionPerformed

  // Ende Methoden
} // end of class guirut
