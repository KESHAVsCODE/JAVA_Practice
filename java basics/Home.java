import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Home extends Frame implements ActionListener{
		Button b,b1,b2;
		Home(String s){
			super(s);
			setLayout(new FlowLayout());
			b=new Button("Insert");
			b1=new Button("Edit");
			b2=new Button("Delete");
			b.addActionListener(this);
			b1.addActionListener(this);
			b2.addActionListener(this);
			add(b);
			add(b1);
			add(b2);
		}
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==b){
				Insert in=new Insert("Insert");
				in.setSize(500,500);
				in.setVisible(true);
				this.setVisible(false);
			}
			else if(e.getSource()==b1){
				Edit ed=new Edit("Edit");
				ed.setSize(500,500);
				ed.setVisible(true);
				this.setVisible(false);		
			}
			else if(e.getSource()==b2){
				Delete de=new Delete("Delete");
				de.setSize(500,500);
				de.setVisible(true);
				this.setVisible(false);		
			}
		}
		public static void main(String []arr){
			Home h=new Home("Home");
			h.setSize(500,500);
			h.setVisible(true);
			
		}
}