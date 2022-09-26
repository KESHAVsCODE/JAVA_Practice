import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class Bio extends JApplet{
   JLabel l,l1;
   JTextField t,t1,t2;
   JButton jb;
   public void init(){
      l=new JLabel("Name");
      l1=new JLabel("Mobile No");
      t=new JTextField(20);
      t1=new JTextField(20);
      jb=new JButton("submit");
       add(l);
       add(l1);
       add(t);
       add(t1);
       add(jb);
       setLayout(null);
       l.setBounds(30,50,100,20);
       l1.setBounds(30,100,100,20);
       t.setBounds(150,50,100,20);
       t1.setBounds(150,100,100,20);
       jb.setBounds(100,150,80,20);
    }
}       
 //<applet code="Bio.class"width=500 height=500></applet>
     