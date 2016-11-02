package main.gui;

import javax.swing.*;
import main.Heroes.*;
import main.main;
import java.awt.*;
import java.awt.event.*;
import main.Util.util;


/**
  *
  * Description
  *
  * @version 1.0 from 11/1/2016
  * @author 
  */

public class gui_herocre extends JFrame {
  // start attributes
  private JButton Button_Race_1 = new JButton();
  private JButton Button_Race_2 = new JButton();
  private JButton Button_Race_3 = new JButton();
  private JButton Button_Race_4 = new JButton();
  private JButton Button_Race_5 = new JButton();
  private JButton Button_Race_6 = new JButton();
  private JTextField Input_Name = new JTextField();
  private JButton Button_Create = new JButton();
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JComboBox<String> Input_Gender = new JComboBox<String>();
    private DefaultComboBoxModel<String> Input_GenderModel = new DefaultComboBoxModel<String>();
  private util util = new util();
  private main main;
  // end attributes
  
  public gui_herocre(main pmain) {
    // Frame-Init
    super();
    main = pmain;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1028; 
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Hero Creation");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    Button_Race_1.setBounds(750, 50, 200, 49);
    Button_Race_1.setText("Race_1");
    Button_Race_1.setMargin(new Insets(2, 2, 2, 2));
    Button_Race_1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Race_1_ActionPerformed(evt);
      }
    });
    Button_Race_1.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Race_1);
    Button_Race_2.setBounds(750, 150, 200, 50);
    Button_Race_2.setText("Race_2");
    Button_Race_2.setMargin(new Insets(2, 2, 2, 2));
    Button_Race_2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Race_2_ActionPerformed(evt);
      }
    });
    Button_Race_2.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Race_2);
    Button_Race_3.setBounds(750, 250, 200, 50);
    Button_Race_3.setText("Race_3");
    Button_Race_3.setMargin(new Insets(2, 2, 2, 2));
    Button_Race_3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Race_3_ActionPerformed(evt);
      }
    });
    Button_Race_3.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Race_3);
    Button_Race_4.setBounds(750, 358, 200, 50);
    Button_Race_4.setText("Race_4");
    Button_Race_4.setMargin(new Insets(2, 2, 2, 2));
    Button_Race_4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Race_4_ActionPerformed(evt);
      }
    });
    Button_Race_4.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Race_4);
    Button_Race_5.setBounds(750, 450, 200, 50);
    Button_Race_5.setText("Race_5");
    Button_Race_5.setMargin(new Insets(2, 2, 2, 2));
    Button_Race_5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Race_5_ActionPerformed(evt);
      }
    });
    Button_Race_5.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Race_5);
    Button_Race_6.setBounds(750, 550, 200, 50);
    Button_Race_6.setText("Race_6");
    Button_Race_6.setMargin(new Insets(2, 2, 2, 2));
    Button_Race_6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Race_6_ActionPerformed(evt);
      }
    });
    Button_Race_6.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Race_6);
    Input_Name.setBounds(75, 550, 250, 50);
    Input_Name.setText("");
    Input_Name.setFont(new Font("Dialog", Font.PLAIN, 52));
    cp.add(Input_Name);
    Button_Create.setBounds(360, 600, 250, 50);
    Button_Create.setText("Create");
    Button_Create.setMargin(new Insets(2, 2, 2, 2));
    Button_Create.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) {
        try {
          Button_Create_ActionPerformed(evt);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    Button_Create.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Button_Create);
    jTextArea1ScrollPane.setBounds(300, 50, 350, 444);
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);
    Input_Gender.setModel(Input_GenderModel);
    Input_Gender.setBounds(25, 56, 200, 50);
    Input_Gender.setFont(new Font("Dialog", Font.BOLD, 32));
    Input_GenderModel.addElement("Gender");
    Input_GenderModel.addElement("Male");
    Input_GenderModel.addElement("Female");
    Input_Gender.setMaximumRowCount(3);
    cp.add(Input_Gender);
    // end components
    
    setVisible(true);
  } // end of public gui_herocre
  
  // start methods
  private int race_int =0;


  private String getRace(int i){
    switch (i) {
      case 0: {return null;}
      case 1: {return "Warrior";}
      case 2: {return null;}
      case 3: {return null;}
      case 4: {return null;}
      case 5: {return null;}
      case 6: {return null;}
    }
    return null;
  }

  private void aktanzeige(){
  jTextArea1.setText(null);
  }

  
  public void Button_Race_1_ActionPerformed(ActionEvent evt) {
    race_int=1;
    aktanzeige();
  } // end of Button_Race_1_ActionPerformed

  public void Button_Race_2_ActionPerformed(ActionEvent evt) {
    race_int=2;
    aktanzeige();
  } // end of Button_Race_2_ActionPerformed

  public void Button_Race_3_ActionPerformed(ActionEvent evt) {
    race_int=3;
    aktanzeige();
  } // end of Button_Race_3_ActionPerformed

  public void Button_Race_4_ActionPerformed(ActionEvent evt) {
    race_int=4;
    aktanzeige();
  } // end of Button_Race_4_ActionPerformed

  public void Button_Race_5_ActionPerformed(ActionEvent evt) {
    race_int=5;
    aktanzeige();
  } // end of Button_Race_5_ActionPerformed

  public void Button_Race_6_ActionPerformed(ActionEvent evt) {
    race_int=6;
    aktanzeige();
  } // end of Button_Race_6_ActionPerformed

  public void Button_Create_ActionPerformed(ActionEvent evt) throws InterruptedException {
    Heroes mainHero=null;
    if (race_int==0 || Input_Name.getText()==""|| Input_Gender.getSelectedIndex()==0){
      jTextArea1.setText(null);
      jTextArea1.setText("Check if all inputs are set!\n Name/Gender/Type");
    }
    else{
      switch (race_int) {
        case 0: {}
        case 1: {mainHero = new Warrior(Input_Name.getText(),Input_Gender.getSelectedIndex()==2,util.randInt(4,8));}
        case 2: {}
        case 3: {}
        case 4: {}
        case 5: {}
        case 6: {}
        }
        if (mainHero!=null)
        {main.herocreattomainmen(main,mainHero); this.dispose();}

    }
  } // end of Button_Create_ActionPerformed

  // end methods
} // end of class gui_herocre
