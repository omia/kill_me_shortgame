package main.gui;
import main.Heroes.Heroes;
import main.Heroes.Warrior;
import main.levels.levelgen;
import main.main;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
  *
  * Description
  *
  * @version 1.0 from 11/6/2016
  * @author 
  */

public class gui_levelselect extends JFrame {
  // start attributes
  JButton[][] b  = new JButton[10][10];
  private main main;
  private JFrame m = this;
  private Heroes mainHero;
  // end attributes
  
  public gui_levelselect(main pmain, Heroes pmainHer) {
    // Frame-Init
    super();
    main=pmain;
    mainHero=pmainHer;
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1080; 
    int frameHeight = 720;
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
    for (int i=0;i<10;i++){
      for (int m=0;m<10;m++){
        b[i][m]=new JButton();
      }
    }

    int r=0;
    int c=1;
    int n=1;
    for (JButton[] u: b) {
      for (JButton elem: u) {
        int l=n;
        elem.setBounds(r*100+50,c*50+30,75,25);
        elem.setText(""+n);
        elem.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
            new gui_battle(main,levelgen.getlevel(l),mainHero,true);
            m.dispose();
          }
        });
        if (n>mainHero.getLevel_complieted()+1){elem.setEnabled(false);}
        cp.add(elem);
        n++;
        c++;
      }
      c=1;
      r++;
    }
    // end components
    
    setVisible(true);
  } // end of public gui_levelselect
  
  // start methods
  public void a(ActionEvent evt) {}

  
  // end methods
} // end of class gui_levelselect
