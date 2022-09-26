import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Two extends Applet implements ActionListener{
			Label l;
			TextField t,t1;
			Button b,b1;
			public void init(){
				l=new Label("value");
				t=new TextField(20);
				t1=new TextField(20);
				b=new Button("squre");
				b1=new Button("qube");
				add(l);
				add(t);
				add(t1);
				add(b);
				add(b1);
				b.addActionListener(this);
				b1.addActionListener(this);
			}
			public void actionPerformed(ActionEvent e){
				try{
					int i=Integer.parseInt(t.getText());
					if(e.getSource()==b){
						i=i*i;
					}
					else{
						i=i*i*i;
					}
					t1.setText(i+"");
				}
				catch(Exception x){}
				
			}
}	
//<applet code="Two.class" width=500 height=500></applet>
