import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class Mnu extends Frame{
		MenuBar mb;
		Menu m,m1;
		MenuItem mi1,mi2,mi3,mi4;
		Mnu(String s){
			super(s);
			mb=new MenuBar();
			m=new Menu("File");
			m1=new Menu("Edit");
			mi1=new MenuItem("New");
			mi2=new MenuItem("open");
			mi3=new MenuItem("redo");
			mi4=new MenuItem("undo");
			m.add(mi1);
			m.add(mi2);
			m1.add(mi3);
			m1.add(mi4);
			mb.add(m);
			mb.add(m1);
			setMenuBar(mb);
		}
		public static void main(String []arr){
			Mnu n=new Mnu("Menu");
			n.setSize(500,500);
			n.setVisible(true);
		}

}