import java.awt.*;
import java.applet.*;
public  class Recta extends Applet{
			public void paint(Graphics g){
					g.setColor(Color.black);
					g.fillArc(100,100,70,70,180,180);
					g.drawArc(100,100,70,70,180,180);
					g.setColor(Color.pink);
					g.fillArc(120,110,40,70,180,180);
					g.drawArc(120,110,40,70,180,180);
			}
} 
/*<applet code="Recta.java" width=600 height=600></applet>*/