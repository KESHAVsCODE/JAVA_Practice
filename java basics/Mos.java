import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Mos extends Applet implements MouseListener,MouseMotionListener{
			int x,y;
			String s=null;
			public void init(){
					addMouseListener(this);
					addMouseMotionListener(this);
			}
			public void mouseClicked(MouseEvent e){
					x=e.getX();
					y=e.getY();
					s="Click";
					repaint();
			}
			public void mousePressed(MouseEvent e){
					x=e.getX();
					y=e.getY();
					s="Press";			
					repaint();
			}
			public void mouseReleased(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
			public void mouseMoved(MouseEvent e){
					x=e.getX();
					y=e.getY();
					s="Move";
					repaint();
			}
			public void mouseDragged(MouseEvent e){}
			public void paint(Graphics g){
					g.drawString(s,x,y);			
			}
			
}
//<applet code="Mos.class" width=500 height=500></applet>