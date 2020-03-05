package battle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class main extends JFrame {
    public main() {
        
        
        //Panels
        jPanel1=new JPanel(new BorderLayout());        
        jPanelN=new JPanel(new BorderLayout());
        jPanelC=new JPanel(new BorderLayout());        
        jPanelS=new JPanel(new BorderLayout());

        
        //100 koumpia topothetisis ploion
        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        pw = new JPanel(new GridLayout(10, 10));
        for (int i = 0; i < 100; i++) {
            JButton t = new JButton(String.valueOf(i + 1));
            t.addActionListener((ActionListener) this);
            pw.add(t);
        }

        
        //25 koumpia ploion
        sp5 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        pw5 = new JPanel(new GridLayout(5, 5));
        for (int i = 0; i < 25; i++) {
            JButton t = new JButton(String.valueOf(i + 1));
            t.addActionListener((ActionListener) this);
            pw5.add(t);
        }

        
        //2 koumpia katw aristera kai deksia
        jButton_turn=new JButton("Turn");        
        jButton_start=new JButton("Start");
        
        
        //diachorismos arxikou panel sta 3
        jPanel1.add(jPanelN, BorderLayout.NORTH);
        jPanel1.add(jPanelC, BorderLayout.CENTER);
        jPanel1.add(jPanelS, BorderLayout.SOUTH);
        
        
        //epikefalida
        System.out.println("Please select ships from the left and place them in your board. Press 'start game' when you are ready!");
//        jPanelN.add( ,BorderLayout.CENTER);


        jPanelS.add(jButton_turn, BorderLayout.WEST);
        jPanelS.add(jButton_start, BorderLayout.EAST);

        
        sp.add(pw);
        jPanelC.add(sp, BorderLayout.CENTER);
        
        
        sp5.add(pw5);
        jPanelC.add(sp5, BorderLayout.WEST);
        
        
        //diachorismos arxikou panel sta 3
        jPanel1.add(jPanelN, BorderLayout.NORTH);
        jPanel1.add(jPanelC, BorderLayout.CENTER);
        jPanel1.add(jPanelS, BorderLayout.SOUTH);        
        add(jPanel1);
          
        
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);   
        
    }
    public static void main(String[] args) {
        new main().setVisible(true);
    }   
    
    private JButton jButton_turn,jButton_start;
    private JPanel jPanel1,jPanelN,jPanelC,jPanelS;
    
    private JSplitPane sp,sp5;
    private JPanel pw,pw5;

}