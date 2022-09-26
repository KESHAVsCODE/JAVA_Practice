
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Ket extends Applet implements KeyListener{
			String s=" ";
			public void init(){
					addKeyListener(this);
			}
			public void keyTyped(KeyEvent e){
					s=s+e.getKeyChar();
					repaint();
			}
			public void keyPressed(KeyEvent  e){}
			public void keyReleased(KeyEvent  e){}
			public void paint(Graphics g){
					g.drawString(s,50,100);
			}
}
/*<applet code="Ket.class" width=500 height=500></applet>*/