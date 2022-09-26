import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class line extends Applet implements MouseListener,MouseMotionListener{
			int x,y,a,b;
			int start;
			public void init(){
					
					start=0;
					addMouseListener(this);
					addMouseMotionListener(this);
			}
			public void mouseClicked(MouseEvent e){
						x=e.getX();
						y=e.getY();
						start=1;
						repaint();
									
			}
			public void mouseReleased(MouseEvent e){}
			public void mousePressed(MouseEvent e){}
			public void mouseEntered(MouseEvent e){}
			public void mouseExited(MouseEvent e){}
			public void mouseMoved(MouseEvent e){
						x=e.getX();
						y=e.getY();
						a=e.getX();
						b=e.getY();
						repaint();
			}
			public void mouseDragged(MouseEvent e){}
			public void paint(Graphics g){
					if(start==1){
						g.drawLine(x,y,a,b);
						
						
					}
			}
}
//<applet code="line.class" width=500 height=500></applet>