import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class First extends Frame implements ActionListener{
		Button b;
		First(String s){
			super(s);
			setLayout(new FlowLayout());
			b=new Button("Second");
			b.addActionListener(this);
			add(b);
		}
		public void actionPerformed(ActionEvent e){
			Second sd=new Second("Second");
			sd.setSize(500,500);
			sd.setVisible(true);
			this.setVisible(false);
		}
		public static void main(String []arr){
			First f=new First("First");
			f.setSize(500,500);
			f.setVisible(true);
			
		}
}