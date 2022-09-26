import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Management extends JFrame impliments ActionListener{
     JButton b,b1,b2;
     Management(String s){
         Super(s);
         setLayout(null);
         b=new JButton("Student");
         b1=new Jbutton("Company");
         b2=new JButton("Search");
         b.setButton(150,100,200,80);
         b1.setBounds(150,210,200,80);
         b2.setBounds(150,320,200,80);
         b.addActionListener(this);
         b1.addActionListener(this);
         b2.addActionLIstener(this);
         add(b);
         add(b1);
         add(b2);  
     }
     public void actionPerformed(ActionEvent e){
       if(e.getSource() ==b)[
           Student sd=new Student("Students");
            sd.setSize(1000,2000);
            sd.setVisible(true);
        }
        if(e.getSource() == b1){
           Company sd1=new Company("Company");
           sd1.setSize(1000,1000);
           sd1.setVisible(true);
         }
         if(e.getSource() ==b2){
            Search sd2=new Search("Search");
             sd2.setSize(700,500);
              sd2.setVisible(true);
          }
           this.setVisible(false);
      }
}




     