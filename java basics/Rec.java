import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Rec extends Applet implements MouseListener,MouseMotionListener{
		int a,x,y;
		int flag,start;
		public void init(){
				a=0;
				x=50;
				y=400;
				flag=0;
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
					a=e.getX();
					repaint();
		}
		public void mouseDragged(MouseEvent e){}
		public void paint(Graphics g){
					if(start==1){
						g.drawRect(a,450,100,50);
						g.drawOval(x,y,50,50);
						if(y==400){
							if(a <= x && x <= a+100){
								           flag=0;
							}
							else{}
						}
						else if(x==0){
							    flag=1;
						}
						else if(y==0){
							    flag=2;
						}
						else if(x==600){
							     flag=3;
						}

						if(flag==0){
							   x--;
							   y--;
						}
						else if(flag==1){
							       x++;
							       y--;
						}
						else if(flag==2){
								x++;
								y++;
						}
						else if(flag==3){
								x--;
								y++;			
						}
						
					}
					try{
						Thread.sleep(10);
					}
					catch(InterruptedException v){}				
					repaint();
		}		
}
//<applet code="Rec.class" width=1500 height=1500></applet>