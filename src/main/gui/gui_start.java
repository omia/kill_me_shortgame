package main.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import main.main;
/**
  *
  * Description
  *
  * @version 1.0 from 11/1/2016
  * @author 
  */

public class gui_start extends JFrame {
  // start attributes
  private JLabel jLabel1 = new JLabel();
  private JButton Button_Start = new JButton();
  private main main;
  // end attributes
  
  public gui_start(main pmain) {
    // Frame-Init
    super();
    main = pmain;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1280; 
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Start");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    jLabel1.setBounds(125, 30, 1024, 256);
    jLabel1.setText("KILL ME");
    jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
    jLabel1.setFont(new Font("Dialog", Font.BOLD, 128));
    cp.add(jLabel1);
    Button_Start.setBounds(416, 400, 467, 153);
    Button_Start.setText("Start");
    Button_Start.setMargin(new Insets(2, 2, 2, 2));
    Button_Start.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Start_ActionPerformed(evt);
      }
    });
    Button_Start.setFont(new Font("Dialog", Font.BOLD, 64));
    cp.add(Button_Start);
    // end components
    
    setVisible(true);
  } // end of public gui_start
  
  // start methods
  

  
  public void Button_Start_ActionPerformed(ActionEvent evt) {
    main.start(main);
    this.dispose();
  } // end of Button_Start_ActionPerformed

  // end methods
} // end of class gui_start
