import java.awt.*;
import java.applet.*;
public class Img extends Applet{
		 Image img;

		public void paint(Graphics g){
				Image img=getImage(getCodeBase(),"heli.GIF");
				g.drawImage(img,0,0,this);    
		}
}
/*<applet code="Img.class" width=1500 height=1500></applet>*/