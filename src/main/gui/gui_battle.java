package main.gui;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import main.Heroes.Heroes;
import main.Monsters.Monsters;
import main.levels.level;
import main.main;
import main.Fighter;
import main.Queue;
import main.Util.util;

/**
  *
  * Description
  *
  * @version 1.0 from 11/2/2016
  * @author 
  */

public class gui_battle extends JFrame {
  // start attributes
  private JTextArea jTextArea1 = new JTextArea("");
    private JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
  private JTextArea jTextArea2 = new JTextArea("");
    private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  private JLabel Label_Demage_Enemy = new JLabel();
  private JLabel Label_Hero_Demage = new JLabel();
  private JLabel Label_Enemy_Life = new JLabel();
  private JLabel Label_Hero_Life = new JLabel();
  private JButton Button_Action_1 = new JButton();
  private JButton Button_Action_2 = new JButton();
  private JButton Button_Action_3 = new JButton();
  private JButton Button_Action_4 = new JButton();
  private JTextArea jTextArea3 = new JTextArea("");
    private JScrollPane jTextArea3ScrollPane = new JScrollPane(jTextArea3);
  private util util=new util();
  private main main;
  private Heroes mainHero;
  private level level;
  private Queue<Fighter> Fighterqu = new Queue<Fighter>();
  // end attributes
  
  public gui_battle(main pmain, level plevel, Heroes pmain_hero) {
    // Frame-Init
    super();
    main=pmain;
    mainHero=pmain_hero;
    level=plevel;
    Monsters[] Monsters = level.getlevelMonster(level);
    if (Monsters[0].getInit()>=mainHero.getInit()){
      for (Monsters mon:Monsters){
        Fighterqu.enqueue(mon);
      }
      Fighterqu.enqueue(mainHero);
    }else {
      Fighterqu.enqueue(mainHero);
      for (Monsters mon:Monsters){
        Fighterqu.enqueue(mon);
      }
    }

    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1028; 
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Random Battle");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    jTextArea1ScrollPane.setBounds(200, 150, 200, 400);
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);
    jTextArea2ScrollPane.setBounds(520, 150, 200, 400);
    jTextArea2.setEditable(false);
    cp.add(jTextArea2ScrollPane);
    Label_Demage_Enemy.setBounds(250, 100, 100, 41);
    Label_Demage_Enemy.setText("");
    Label_Demage_Enemy.setFont(new Font("Dialog", Font.BOLD, 32));
    Label_Demage_Enemy.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(Label_Demage_Enemy);
    Label_Hero_Demage.setBounds(570, 100, 100, 41);
    Label_Hero_Demage.setText("");
    Label_Hero_Demage.setHorizontalAlignment(SwingConstants.CENTER);
    Label_Hero_Demage.setFont(new Font("Dialog", Font.BOLD, 32));
    cp.add(Label_Hero_Demage);
    Label_Enemy_Life.setBounds(250, 560, 100, 41);
        Label_Enemy_Life.setText("");
    cp.add(Label_Enemy_Life);
    Label_Hero_Life.setBounds(570, 560, 100, 41);
    Label_Hero_Life.setText("");
    cp.add(Label_Hero_Life);
    Button_Action_1.setBounds(760, 150, 150, 40);
    Button_Action_1.setText("Default Attack");
    Button_Action_1.setMargin(new Insets(2, 2, 2, 2));
    Button_Action_1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Action_1_ActionPerformed(evt);
      }
    });
    cp.add(Button_Action_1);
    Button_Action_2.setBounds(760, 225, 150, 40);
    Button_Action_2.setText("Special Attack");
    Button_Action_2.setMargin(new Insets(2, 2, 2, 2));
    Button_Action_2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Action_2_ActionPerformed(evt);
      }
    });
    cp.add(Button_Action_2);
    Button_Action_3.setBounds(760, 300, 150, 40);
    Button_Action_3.setText("Items");
    Button_Action_3.setMargin(new Insets(2, 2, 2, 2));
    Button_Action_3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Action_3_ActionPerformed(evt);
      }
    });
    cp.add(Button_Action_3);
    Button_Action_4.setBounds(760, 375, 150, 40);
    Button_Action_4.setText("Run");
    Button_Action_4.setMargin(new Insets(2, 2, 2, 2));
    Button_Action_4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        Button_Action_4_ActionPerformed(evt);
      }
    });
    cp.add(Button_Action_4);
    jTextArea3ScrollPane.setBounds(175, 10, 600, 52);
    jTextArea3.setEditable(false);
    cp.add(jTextArea3ScrollPane);
    // end components
    
    setVisible(true);
    updateall();
  } // end of public gui_battle
  
  // start methods

  private void updateall(){
    Label_Hero_Life.setText(null);
    Label_Enemy_Life.setText(null);
    jTextArea3.setText(null);
    Fighter first=Fighterqu.front();
    Fighter mov;
    Fighterqu.dequeue();
    Fighterqu.enqueue(first);
    jTextArea3.append(first.getName()+" ||");
    while (!first.equals(Fighterqu.front())){
      mov=Fighterqu.front();
      jTextArea3.append(mov.getName()+" ||");
      Fighterqu.dequeue();
      Fighterqu.enqueue(mov);
    }

    String enemyhealt;
    if (Fighterqu.front()==mainHero){
      enemyhealt=util.getsecond(Fighterqu).getHealth()+"/"+util.getsecond(Fighterqu).getMaxhealt();
    }else enemyhealt=Fighterqu.front().getHealth()+"/"+Fighterqu.front().getMaxhealt();
    Label_Enemy_Life.setText(enemyhealt);
    Label_Hero_Life.setText(mainHero.getHealth()+"/"+mainHero.getMaxhealt());

    jTextArea1.setText(null);
    if (Fighterqu.front()==mainHero){
      Fighter secfie = util.getsecond(Fighterqu);
      jTextArea1.append("Name: "+secfie.getName()+"\nArmor: "+secfie.getArmore()+"\nInit: "+secfie.getInit()+"\nDefault Damage: "+secfie.getDdemage()+"\n\nMain Hand: "+secfie.getMainHand().getName()+"\n"+secfie.getMainHand().getDescription());
    }else {
      Fighter secfie = Fighterqu.front();
      jTextArea1.append("Name: "+secfie.getName()+"\nArmor: "+secfie.getArmore()+"\nInit: "+secfie.getInit()+"\nDefault Damage: "+secfie.getDdemage()+"\n\nMain Hand: "+secfie.getMainHand().getName()+"\n"+secfie.getMainHand().getDescription());
    }



  }

  private void doenemyturn(){

  }

  
  public void Button_Action_1_ActionPerformed(ActionEvent evt) {
    Label_Hero_Demage.setText(mainHero.getDdemage()+"");
    util.getsecond(Fighterqu).adddemage(mainHero.getDdemage());
    updateall();
  } // end of Button_Action_1_ActionPerformed

  public void Button_Action_2_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
  } // end of Button_Action_2_ActionPerformed

  public void Button_Action_3_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
  } // end of Button_Action_3_ActionPerformed

  public void Button_Action_4_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
  } // end of Button_Action_4_ActionPerformed

  // end methods
} // end of class gui_battle
