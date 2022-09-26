import java.awt.*;
import java.applet.*;
public class Check extends Applet{
			Checkbox c,c1,c2,c3;
			public void init(){
				c=new Checkbox("c");
				c1=new Checkbox("c++");
				c2=new Checkbox("DSA");
				c3=new Checkbox("JAVA");
				add(c);	
				add(c1);
				add(c2);
				add(c3);
				
			}
}
/*<applet code="Check.class" width=500  height=500></applet>*/