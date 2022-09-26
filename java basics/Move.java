import java.awt.*;
import java.applet.*;
public class Move extends Applet{
			int x,y;
			public void init(){
					x=0;
					y=0;
			}
			public void paint(Graphics g){
					g.drawRect(x,y,90,40);
					g.setColor(Color.green);
					g.fillRect(x,y,90,40);
					x++;
					y++;
			                try{
				            Thread.sleep(10);
			                }
			                catch(InterruptedException e){}
			                repaint();
			}
}
/*<applet code="Move.class" width=500 height=500></applet>*/