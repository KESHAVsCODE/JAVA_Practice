import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.util.*; 
public class Img extends Applet implements MouseListener , MouseMotionListener{
		Image img,im;
		int x,z,v;
		int flag;
		public void init(){
				x=500;
				z=0;
				flag=0;
				addMouseListener(this);
				addMouseMotionListener(this);
		}
		public void mouseClicked(MouseEvent e){
						x=500;
						repaint();
									
		}
		public void mouseReleased(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		public void mouseMoved(MouseEvent e){
					v=e.getY();
					repaint();
		}
		public void mouseDragged(MouseEvent e){}
		

		public void paint(Graphics g){
					
						Image img=getImage(getCodeBase(),"heli.GIF");
						g.drawImage(img,0,v,100,100,this); 
						g.setColor(Color.black);
						g.fillRect(x,z,10,100);
						g.drawRect(x,z,10,100);
						if(x==500){
							flag=0;
						}
					        else if(x==0){
							Random r=new Random();
					                int y=Math.abs(r.nextInt())%450;
							z=y;
						
			 				x=500;
						}
						else if(v<=z&&z<=v+100&&x==100){
							flag=1;
						}
						
						if(flag==0){
						x--;
						}
						else if(flag==1){
							Image im=getImage(getCodeBase(),"sp.gif");
							g.drawImage(im,50,z,100,100,this);
							
						}
						
						try{
							Thread.sleep(10);
						}
						catch(InterruptedException r ){
							
						}	
			  		
				
	       }
}
/*<applet code="Img.class" width=500 height=500></applet>*/