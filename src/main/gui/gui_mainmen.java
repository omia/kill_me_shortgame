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
  private int oldlvl;
  // end attributes
  
  public gui_mainmen(main pmain) {
    // Frame-Init
    super();
    main = pmain;
    oldlvl=main.getMainHero().getLevel();
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
    Area_Your_Hero_Information.append("Name: "+main_Hero.getName());
    Area_Your_Hero_Information.append("\nType: "+main_Hero.getType());
    Area_Your_Hero_Information.append("\n\nLevel: "+main_Hero.getLevel());
    Area_Your_Hero_Information.append("\nXp: "+main_Hero.getXp()+" of "+main_Hero.getLevel()*10);
    Area_Your_Hero_Information.append("\n\nHealth: "+main_Hero.getMaxhealt());
    Area_Your_Hero_Information.append("\nInitiative: "+main_Hero.getInit());
    Area_Your_Hero_Information.append("\nDamage(without Items): "+main_Hero.getDamage());
    Area_Your_Hero_Information.append("\nDamage(with Items): "+main_Hero.getDdemage());
    Area_Your_Hero_Information.append("\nArmor: "+main_Hero.getArmore());
    Area_Your_Hero_Information.append("\n\nMain Hand: "+main_Hero.getMainHand().getName());
    Area_Your_Hero_Information.append("\n"+main_Hero.getMainHand().getDescription());
    Area_Your_Hero_Information.append("\nOffhand: "+main_Hero.getOffHand().getName());
    Area_Your_Hero_Information.append("\n"+main_Hero.getOffHand().getDescription());
    Area_Your_Hero_Information.append("\n\nSpecial Move:");
    Area_Your_Hero_Information.append("\n"+main_Hero.getSpecialdisc());

    if (oldlvl<main_Hero.getLevel()){
      this.setVisible(false);
      oldlvl++;
      new gui_levelup(main);
    }

    jTextArea2.setText(null);
    jTextArea2.append("\n\n"+main_Hero.getLevel_complieted()+" of 100 Levels Completed\nYou died "+main_Hero.getDeathes()+"times.");

    jTextArea1.setText(null);
    jTextArea1.append("\n\nFight a random Battle against Clowns!");
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
