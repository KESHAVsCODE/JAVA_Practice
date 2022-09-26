import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*; 
public class Car extends Applet implements MouseListener , MouseMotionListener{
		Image img,im,i;
		int x,y,z,a;
		int flag;
		public void init(){
				a=175;
				z=0;
				y=0;
				x=120;
				flag=0;
				addMouseListener(this);
				addMouseMotionListener(this);
		}
		public void mouseClicked(MouseEvent e){
						
						a=e.getX();
						repaint();
									
		}
		public void mouseReleased(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseMoved(MouseEvent e){}
		public void mouseDragged(MouseEvent e){}
		

		public void paint(Graphics g){
					
						
						
						g.setColor(Color.green);
						g.fillRect(110,0,140,500);
						g.drawRect(110,0,140,500);
						g.setColor(Color.white);
						g.fillRect(175,70,10,100);
						g.fillRect(175,375,10,100);
						g.drawRect(100,0,10,500);
						g.drawRect(250,0,10,500);
						g.drawRect(175,70,10,100);
						g.drawRect(175,375,10,100);
						Image img=getImage(getCodeBase(),"car1.jpeg");
						g.drawImage(img,a,350,30,60,this); 
						
						if(110<x&&x<250){
						Image im=getImage(getCodeBase(),"car.jpeg");
						g.drawImage(im,x,y,30,60,this);}
						if(y==0){
							flag=0;
						}
						else if(y==500){
							Random r=new Random();
					       		int z=Math.abs(r.nextInt())%250;
							x=z;				
							y=0;
						}
						else if(y==290&&a<=x+30&&x+30<=a+60){
							flag=1;
							
						}
						if(flag==0){
							y++;
						}
						else if(flag==1){
							Image i=getImage(getCodeBase(),"sp.gif");
							g.drawImage(i,180,330,50,50,this);
							y=0;
						}
						
						try{
							Thread.sleep(10);
						}
						catch(InterruptedException  er ){}	
			  		
			repaint();	
	       }
}
/*<applet code="Car.class" width=500 height=500></applet>*/