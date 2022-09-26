import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Face extends Applet implements MouseListener,MouseMotionListener{
			
			int x,y;
			int start;
			public void init(){
					x=190;
					y=210;
					
					start=0;
					addMouseListener(this);
					addMouseMotionListener(this);
			}		
			public void mouseClicked(MouseEvent e){
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
						
						
						repaint();
			}
			public void mouseDragged(MouseEvent e){}
			public void paint(Graphics g){
					
					
					g.drawOval(100,100,300,300);
					g.drawOval(170,190,50,50);
					g.drawOval(280,190,50,50);					
					g.setColor(Color.black);
					if(190<y&&y<250){
						g.fillOval(x,y,10,10);
						g.drawOval(x,y,10,10);
					
						g.fillOval(x+110,y,10,10);
						g.drawOval(x+110,y,10,10);
					}
					g.fillArc(210,250,80,80,180,180);
					g.drawArc(210,250,80,80,180,180);
					if(start==1){
						g.setColor(Color.pink);
						g.fillArc(220,250,60,90,180,180);
						g.drawArc(220,250,60,90,180,180);
						start=0;
					
					}
					
			}
		

}
//<applet code="Face.class" width=500 height=500></applet>