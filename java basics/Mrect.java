import java.awt.*;
import java.applet.*;
public class Mrect extends Applet{
		int x,y;
		int flag;
		public void init(){
				x=0;
				y=0;
				flag=0;
		}
		public void paint(Graphics g){
				g.setColor(Color.blue);
				g.fillRect(x,y,100,50);
				g.drawRect(x,y,100,50);
					if(x==0){
						y=y+50;
						flag=0;
					}
					else if(x==400){
						y=y+50;
						flag=1;
						
					}
					if(flag==0){
						x++;
					}
					else{
						x--;
					}	
				try{
					Thread.sleep(10);
				}
				catch(InterruptedException  e){}
				
				repaint();
		}
}
/*<applet code="Mrect.class" width=500 height=500></applet>*/