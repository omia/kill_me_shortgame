package main.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import main.main;

/**
  *
  * Description
  *
  * @version 1.0 from 11/6/2016
  * @author 
  */

public class gui_levelup extends JFrame {
  // start attributes
  private JButton Button_add1 = new JButton();
  private JButton Button_add2 = new JButton();
  private JButton Button_add3 = new JButton();
  private JButton Button_add4 = new JButton();
  private JLabel Label_Levelup = new JLabel();
  private JLabel Label_1 = new JLabel();
  private JLabel Label_2 = new JLabel();
  private JLabel Label_3 = new JLabel();
  private JLabel Label_4 = new JLabel();
  private main main;
  private JFrame frame;
  // end attributes
  
  public gui_levelup(main pmain) {
    // Frame-Init
    super();
    main=pmain;
    frame=this;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Formular");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    Button_add1.setBounds(25, 75, 125, 25);
    Button_add1.setText("Raise max Health");
    Button_add1.setMargin(new Insets(2, 2, 2, 2));
    Button_add1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_add1_ActionPerformed(evt);
      }
    });
    cp.add(Button_add1);
    Button_add2.setBounds(25, 125, 125, 25);
    Button_add2.setText("Raise Initiative");
    Button_add2.setMargin(new Insets(2, 2, 2, 2));
    Button_add2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_add2_ActionPerformed(evt);
      }
    });
    cp.add(Button_add2);
    Button_add3.setBounds(25, 175, 125, 25);
    Button_add3.setText("Raise Damage");
    Button_add3.setMargin(new Insets(2, 2, 2, 2));
    Button_add3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_add3_ActionPerformed(evt);
      }
    });
    cp.add(Button_add3);
    Button_add4.setBounds(25, 225, 125, 25);
    Button_add4.setText("Raise Armor");
    Button_add4.setMargin(new Insets(2, 2, 2, 2));
    Button_add4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_add4_ActionPerformed(evt);
      }
    });
    cp.add(Button_add4);
    Label_Levelup.setBounds(100, 16, 125, 20);
    Label_Levelup.setText("Level Up!");
    Label_Levelup.setHorizontalTextPosition(SwingConstants.CENTER);
    Label_Levelup.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(Label_Levelup);
    Label_1.setBounds(150, 75, 125, 20);
    Label_1.setText("Current max Health "+main.getMainHero().getMaxhealt());
    cp.add(Label_1);
    Label_2.setBounds(150, 125, 125, 20);
    Label_2.setText("Current Initiative "+main.getMainHero().getInit());
    cp.add(Label_2);
    Label_3.setBounds(150, 175, 125, 20);
    Label_3.setText("Current Damage "+main.getMainHero().getDamage());
    cp.add(Label_3);
    Label_4.setBounds(150, 225, 125, 20);
    Label_4.setText("Current Armor "+main.getMainHero().getArmore());
    cp.add(Label_4);
    // end components
    
    setVisible(true);
  } // end of public gui_levelup
  
  // start methods
  

  public void Button_add1_ActionPerformed(ActionEvent evt) {
    main.getMainHero().rasemaxhealt(1);
    main.showmainmen();
    frame.dispose();
  } // end of Button_add1_ActionPerformed

  public void Button_add2_ActionPerformed(ActionEvent evt) {
    main.getMainHero().raseinit(1);
    main.showmainmen();
    frame.dispose();
  } // end of Button_add2_ActionPerformed

  public void Button_add3_ActionPerformed(ActionEvent evt) {
    main.getMainHero().raseddemage(1);
    main.showmainmen();
    frame.dispose();
  } // end of Button_add3_ActionPerformed

  public void Button_add4_ActionPerformed(ActionEvent evt) {
    main.getMainHero().rasearmore(1);
    main.showmainmen();
    frame.dispose();
  } // end of Button_add4_ActionPerformed

  // end methods
} // end of class gui_levelup
