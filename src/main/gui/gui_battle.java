package main.gui;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.*;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator;
import main.Heroes.Heroes;
import main.Monsters.Monsters;
import main.levels.level;
import main.main;
import main.Fighter;
import main.Queue;
import main.Util.util;
import oracle.jrockit.jfr.JFR;
import sun.security.jca.GetInstance;

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
   private boolean islevel;
  private Queue<Fighter> Fighterqu = new Queue<Fighter>();
  private JFrame frame=this;
    private double levellife;
  // end attributes
  
  public gui_battle(main pmain, level plevel, Heroes pmain_hero, boolean pislevel) {
    // Frame-Init
    super();
    main=pmain;
    mainHero=pmain_hero;
    mainHero.heal();
    level=plevel;
    islevel=pislevel;
    levellife=level.getgeslif();
    Monsters[] Monsters = level.getlevelMonster(level);
    Fighter[] Fighter = new Fighter[level.getLevel_monster_count()+1];
      int p=0;
      Fighter[p]=mainHero;
      p++;
      for (Monsters elem:Monsters){
        Fighter[p]=elem;
          p++;
    }
      for (Monsters elem:Monsters){
          if (elem == null){
              System.out.print("error in the array");
          }
      }
      Arrays.sort(Fighter);

      for (Fighter elem:Fighter){
         Fighterqu.enqueue(elem);
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
    
    jTextArea1ScrollPane.setBounds(180, 150, 250, 400);
    jTextArea1.setEditable(false);
    cp.add(jTextArea1ScrollPane);
    jTextArea2ScrollPane.setBounds(500, 150, 250, 400);
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
    Button_Action_2.setText("Special Move");
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
      start();
  } // end of public gui_battle
  
  // start methods

    public level getLevel(){return level;};

    private int specialattack=0;
    private int run=0;

  private void updateall(){
    Label_Demage_Enemy.setText(null);
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

        if (Fighterqu.front() == mainHero && util.getsecond(Fighterqu)!=mainHero) {
           Monsters secfie = (Monsters) util.getsecond(Fighterqu);
           jTextArea1.append("Name: " + secfie.getName() + "\n" + secfie.getRace() + "\nArmor: " + secfie.getArmore() + "\nInit: " + secfie.getInit() + "\nDefault Damage: " + secfie.getDdemage() + "\n\nMain Hand: " + secfie.getMainHand().getName() + "\n" + secfie.getMainHand().getDescription() +  "\nOffhand: " + secfie.getOffHand().getName() + "\n" + secfie.getOffHand().getDescription());
       } else if(Fighterqu.front()!=mainHero){
           Monsters secfie = (Monsters) Fighterqu.front();
           jTextArea1.append("Name: " + secfie.getName() + "\n" + secfie.getRace() + "\nArmor: " + secfie.getArmore() + "\nInit: " + secfie.getInit() + "\nDefault Damage: " + secfie.getDdemage() + "\n\nMain Hand: " + secfie.getMainHand().getName() + "\n" + secfie.getMainHand().getDescription() +  "\nOffhand: " + secfie.getOffHand().getName() + "\n" + secfie.getOffHand().getDescription());
       }

       jTextArea2.setText(null);
       String spec;
       if (specialattack == 0) {
           spec = "Usable!";
       } else {
           spec = "Loading!";
       }
       jTextArea2.append("Name: " + mainHero.getName() + "\nArmor: " + mainHero.getArmore() + "\nInit: " + mainHero.getInit() + "\nDefault Damage: " + mainHero.getDdemage() + "\n\nMain Hand: " + mainHero.getMainHand().getName() + "\n" + mainHero.getMainHand().getDescription() + "\nOffhand: " + mainHero.getOffHand().getName() + "\n" + mainHero.getOffHand().getDescription() + "\n\nSpecial Attack:\n" + mainHero.getSpecialdisc() + "\n" + spec);

  }

  private void start(){
      updateall();
      if (Fighterqu.front()!=mainHero&&mainHero.getHealth()>0){
          System.out.println("enemy turn");
           Thread enemy = new enemyturn();
          enemy.start();
      }
  }

  private void doenemyturn(){
      if (util.getsecond(Fighterqu).getHealth()<1){
        Fighterqu.dequeue();
          Fighterqu.enqueue(mainHero);
          Fighterqu.dequeue();
          if(Fighterqu.front()==mainHero){
              new outputdialog(frame,"End",false,true);
              System.out.println("won");
          }
      }
      else {Fighterqu.dequeue();Fighterqu.enqueue(mainHero);}
        run=0;
        start();
  }

  private void shownext(){
      jTextArea3.setText(null);

  }
  
  public void Button_Action_1_ActionPerformed(ActionEvent evt) {
      if (Fighterqu.front()==mainHero) {
          specialattack=0;
          if (mainHero.getType()=="Rogue"){util.getsecond(Fighterqu).setFrozen(false);}
          Label_Hero_Demage.setText(mainHero.getDdemage() + "");
          util.getsecond(Fighterqu).adddemage(mainHero.getDdemage());
          levellife= (levellife-mainHero.getDdemage());
          doenemyturn();
      }

  } // end of Button_Action_1_ActionPerformed

  public void Button_Action_2_ActionPerformed(ActionEvent evt) {
      if (Fighterqu.front()==mainHero && specialattack==0) {
          switch (mainHero.getType()) {
              case "Warrior":
                  Label_Hero_Demage.setText(mainHero.getDdemage()*1.5 + "");
                  util.getsecond(Fighterqu).adddemage(mainHero.getDdemage()*1.5);
                  levellife= (levellife-mainHero.getDdemage()*1.5);
                  System.out.println("W");
                  break;

              case "Mage":
                util.getsecond(Fighterqu).setOnfire(true);
                  System.out.println("m");
                  break;

              case "Healer":
                 mainHero.addhealth(mainHero.getDdemage());
                  System.out.println("h");
                  break;

              case "Archer":
                  Label_Hero_Demage.setText(mainHero.getDdemage() + "");
                  util.getsecond(Fighterqu).adddemage(mainHero.getDdemage());
                  levellife= (levellife-mainHero.getDdemage());
                  if (util.getthird(Fighterqu)!=mainHero ){
                      util.getthird(Fighterqu).adddemage(mainHero.getDdemage());
                      levellife= (levellife-mainHero.getDdemage());
                  }
                  System.out.println("A");
                  break;

              case "Snowman":
                  util.getsecond(Fighterqu).setFrozen(true);
                  System.out.println("S");
                  break;

              case "Rogue":
                  util.getsecond(Fighterqu).setFrozen(true);
                  util.getsecond(Fighterqu).setForzenvor(1);
                  System.out.println("R");
                  break;
          }
          specialattack = 1;
          doenemyturn();
      }
  } // end of Button_Action_2_ActionPerformed

  public void Button_Action_3_ActionPerformed(ActionEvent evt) {

      //Custom button text

  } // end of Button_Action_3_ActionPerformed

  public void Button_Action_4_ActionPerformed(ActionEvent evt) {
      if (run==0){
    jTextArea3.setText(null);
    jTextArea3.setText("If you are sure press run again! If not just attack");
      run++;}
      else {main.showmainmen();
          this.dispose();}
  } // end of Button_Action_4_ActionPerformed

  // end methods

    private class outputdialog extends JDialog{
      // Anfang Attribute
      private JLabel jLabel1 = new JLabel();
      private JButton jButton1 = new JButton();
       private boolean won;
        private JFrame master;
      // Ende Attribute

      public outputdialog(JFrame owner, String title, boolean modal,boolean pwon) {
          // Dialog-Initialisierung
          super(owner, title, modal);
          won=pwon;
          master=owner;
          setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
          int frameWidth = 356;
          int frameHeight = 238;
          setSize(frameWidth, frameHeight);
          Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
          int x = (d.width - getSize().width) / 2;
          int y = (d.height - getSize().height) / 2;
          setLocation(x, y);
          Container cp = getContentPane();
          cp.setLayout(null);
          // Anfang Komponenten

          jLabel1.setBounds(48, 24, 254, 36);
          if(won){jLabel1.setText("You Won");}
          else {jLabel1.setText("You are Death");}
          cp.add(jLabel1);
          jButton1.setBounds(112, 120, 150, 41);
          jButton1.setText("Back to main Menu");
          jButton1.setMargin(new Insets(2, 2, 2, 2));
          jButton1.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent evt) {
                  jButton1_ActionPerformed(evt);
              }
          });
          cp.add(jButton1);
          // Ende Komponenten

          setResizable(false);
          setVisible(true);
      } // end of public temp

      // Anfang Methoden
      public void jButton1_ActionPerformed(ActionEvent evt) {
          master.dispose();
          Double xp=0.0;
          if (won) {
              if (level.isBoss()) {
                   xp = (level.getgeslif()/level.getLevel_id()*5.01258);
              }
              else {
                  xp = (level.getgeslif() / level.getLevel_id() * 2.01258);
              }
              if (islevel&& level.getLevel_id()>mainHero.getLevel_complieted()){mainHero.addLevel_complieted();}
          }else {mainHero.addDeath(); xp = ((level.getgeslif()-levellife)/level.getLevel_id()*5.01258);}
          mainHero.add_xp(xp);
          main.showmainmen();
          this.dispose();



      } // end of jButton1_ActionPerformed

      // Ende Methoden
    }
    private class enemyturn extends Thread{
        @Override
        public void run() {
            try{
                System.out.println("start enemy");
                Thread.sleep(1000);
                Label_Hero_Demage.setText(null);
                updateall();
                Monsters current = (Monsters) Fighterqu.front();
                if (current.isFrozen()==true){
                    current.setForzenvor(current.getForzenvor()-1);
                    Label_Demage_Enemy.setText("F");
                    if (current.getForzenvor()==0){current.setFrozen(false);}

                }else {
                Label_Demage_Enemy.setText(current.getDdemage()+"");
                mainHero.adddemage(current.getDdemage());}
                System.out.println("enemy: "+current.getName());
                if (current.isOnfire()){current.adddemage(1);}
                Thread.sleep(1000);
                Fighterqu.dequeue();
                Fighterqu.enqueue(current);
                if (mainHero.getHealth()<=0){new outputdialog(frame,"End",false,false); System.out.println("lost");}
                System.out.println("Next");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            gui_battle.this.start();

        }
    }

} // end of class gui_battle
