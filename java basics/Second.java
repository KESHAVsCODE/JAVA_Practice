import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public  class Second extends Frame implements ActionListener{
		Button b;
		Second(String s){
			super(s);
			setLayout(new FlowLayout());
			b=new Button("First");
			b.addActionListener(this);
			add(b);
		}
		public void actionPerformed(ActionEvent e){
			First f=new First("First");
			f.setSize(500,500);
			f.setVisible(true);
			this.setVisible(false);
		}
}