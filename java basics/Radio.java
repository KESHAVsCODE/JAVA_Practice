import java.awt.*;
import java.applet.*;
public class Radio extends Applet{
			CheckboxGroup cg;
			Checkbox c,c1;
			public void init(){
					cg=new CheckboxGroup();
					c=new Checkbox("Male",false,cg);
					c1=new Checkbox("Female",cg,false);
					add(c);
					add(c1);
			}
}
/*<applet code="Radio.class" width=500 height=500></applet>*/