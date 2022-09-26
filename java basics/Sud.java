import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
public  class Sud extends Applet implements ActionListener{
			Button b,b1,b2;
			AudioClip au=null;
			public void init(){
					au=getAudioClip(getCodeBase(),"1.WAV");
					b=new Button("play");
					b1=new Button("stop");
					b2=new Button("Repeat");
					b.addActionListener(this);
					b1.addActionListener(this);
					b2.addActionListener(this);
					
			}
			public void actionPerformed(ActionEvent e){
					if(e.getSource()==b){
						au.play();
					}
					else if(e.getSource()==b1){
						au.stop();					
}
					else{
						au.loop();
					}
					
			}
}
/*<applet code="Sud.class" width=700 height=700></applet>*/