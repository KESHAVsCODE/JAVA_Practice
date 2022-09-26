import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class Sub extends JApplet{
   JLabel l,l1;
   JTextField t,t1,t2;
   JButton jb;
  public void init(){
  l=new JLabel("Name");
  l1=new JLabel("Mobile No.");
  t=new JTextField(20);
  t1=new JTextField(20);
  jb=new JButton("submit");
  add(l);
  add(l1);
  add(t);
  add(t1);
  add(jb);
  setLayout(new FlowLayout());
 }
}
  //<applet code="Sub.class"width=500 height=500></applet>