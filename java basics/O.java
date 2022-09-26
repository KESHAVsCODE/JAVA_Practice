import java.awt.*;
import java.applet.*;
public class O extends Applet{
	int x,y;
	int flag,flag1;
	public void init(){
		x=0;
		y=300;
		flag=0;
		flag1=1;
	}
	public void paint(Graphics g){
		g.drawOval(x,y,50,50);
		if(x==0){
			flag=0;
		}
		else if(x==450){
			flag=1;
		}
		if(flag==0){
			x++;
			if(y==300){
				flag1=0;
			}
			else if(y==450){
				flag1=1;
			}
			if(flag1==0){
				y++;
			}
			else if(flag1==1){
				y--;
			}
		}
		else{
			x--;
			if(y==300){
				flag1=0;
			}
			else if(y==450){
				flag1=1;
			}
			if(flag1==0){
				y--;
			}
			else if(flag1==1){
				y++;
			}
		}
		try{
			Thread.sleep(10);
		}
		catch(InterruptedException e){}
	
	       repaint();
	}
}
//<applet code="O.class" width=500 height=500></applet>