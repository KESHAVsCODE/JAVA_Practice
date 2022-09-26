import java.awt.*;
public class Frm extends Frame{
		Button b,b1;
		Frm(String s){
			super(s);
			setLayout(new FlowLayout());
			b=new Button("First");
			b1=new Button("Second");
			add(b);
			add(b1);
		}
		public static void main(String []arr){
			Frm f=new Frm("pro");
			f.setSize(500,500);
			f.setVisible(true);
		}
}