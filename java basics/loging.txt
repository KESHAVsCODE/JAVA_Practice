import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame impliment Actionlistener{
    JLable l,l1;
    JTextField t,t1;
    JButton b;
    public Login(string s){
       super(s);
       setLayout(NULL);
       l=new JLabel("Admin id");
       l1=new JLabel("password");
       t=new JTextField("50");
       t1=new JTextField("16");
       b=new JButton("Login");
       l.setBounds(100,100,170,50);
       l1.setBounds(100,200,170,50);
       t.setBounds(300,100,170,50);
       t1.setBounds(300,200,170,50);
       add(l);
       add(l1);
       add(t);
       add(t1);
       add(b);
       b.addActionListener;
}
public void actionPerformed(Actionevent e){
   try{
       string id = t.getText();
       string pass = t1.getText();
       class.forName("sun.gdbc.odbc.jdbc.odbcDriver");
       connection cn=DriverManager.getConnection("jdbc:odbc:dsn");
       PreparedStatment ps = cn.PrepareStatment("insert into Login values(??)");
       ps.setString(1,id);
       ps.setString(2,pass);
       if (ps.executeUpdate() > 0){
            JoptionPane.showMessageDialog(null,"user Matched");
          }
       else{
             JOptionPane.showMessageDialog(null,"try Again");
             }
          cn.close();
      }
      catch(Exception er){
        JOptionPane.showMessageDialog(null,er.getMessage());
       if(e.getSource() == b){
          Management mg =new Management("Management");
          mg setSize(500,500);
          mg.setVisible(true);
        }
        this.setVisible(false);
      }
}
public static void main(string[] arr){
   Login x = new Login("Login");
   x.setSize(500,500);
   x.setVisible(true);
}


          

