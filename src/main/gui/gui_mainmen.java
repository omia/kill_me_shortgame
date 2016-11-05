package main.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import main.Heroes.Heroes;
import main.main;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;


/**
  *
  * Description
  *
  * @version 1.0 from 11/1/2016
  * @author 
  */

public class gui_mainmen extends JFrame {
  // start attributes
  private JTextArea Area_Your_Hero_Information = new JTextArea("");
    private JScrollPane Area_Your_Hero_InformationScrollPane = new JScrollPane(Area_Your_Hero_Information);
  private JLabel Label_Hero = new JLabel();
  private JButton Button_Story = new JButton();
  private JButton Button_RandomBa = new JButton();
  private JTextArea jTextArea2 = new JTextArea("");
    private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private main main;
  // end attributes
  
  public gui_mainmen(main pmain) {
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
    setTitle("Main Menu");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    Area_Your_Hero_InformationScrollPane.setBounds(90, 150, 250, 500);
    Area_Your_Hero_Information.setEditable(false);
    cp.add(Area_Your_Hero_InformationScrollPane);
    Label_Hero.setBounds(90, 55, 250, 50);
    Label_Hero.setText("Your_Hero_Name");
    Label_Hero.setFont(new Font("Dialog", Font.BOLD, 25));
    cp.add(Label_Hero);
    Button_Story.setBounds(400, 150, 325, 100);
    Button_Story.setText("Story");
    Button_Story.setMargin(new Insets(2, 2, 2, 2));
    Button_Story.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Story_ActionPerformed(evt);
      }
    });
    Button_Story.setFont(new Font("Dialog", Font.BOLD, 64));
    cp.add(Button_Story);
    Button_RandomBa.setBounds(400, 425, 325, 100);
    Button_RandomBa.setText("Random Battel");
    Button_RandomBa.setMargin(new Insets(2, 2, 2, 2));
    Button_RandomBa.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_RandomBa_ActionPerformed(evt);
      }
    });
    Button_RandomBa.setFont(new Font("Dialog", Font.BOLD, 40));
    cp.add(Button_RandomBa);
    jTextArea2ScrollPane.setBounds(400, 275, 325, 75);
    jTextArea2.setEditable(false);
    cp.add(jTextArea2ScrollPane);
    jTextArea1ScrollPane.setBounds(400, 550, 325, 75);
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);
    // end components
    
    setVisible(true);
  } // end of public gui_mainmen
  
  // start methods

  public void Information_update(){
    Heroes main_Hero = main.getMainHero();
    Label_Hero.setText(main_Hero.getName());
    Area_Your_Hero_Information.setText(null);
    Area_Your_Hero_Information.append("Name: "+main_Hero.getName()+"\nType: "+main_Hero.getType()+"\nLevel: "+main_Hero.getLevel()+"\nXp: "+main_Hero.getXp()+" of "+main_Hero.getLevel()*10);
  }
  
  public void Button_Story_ActionPerformed(ActionEvent evt) {
    main.mainbutstory(main);
    this.setVisible(false);
  } // end of Button_Story_ActionPerformed

  public void Button_RandomBa_ActionPerformed(ActionEvent evt) {
    main.mainbutranbattle(main);
    this.setVisible(false);
  } // end of Button_RandomBa_ActionPerformed

  // end methods
} // end of class gui_mainmen
