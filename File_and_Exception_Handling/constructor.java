class Tm{
	public Tm(){
		System.out.println("HELLO");
	}
}
class Tn extends Tm{
	protected Tn(){
		System.out.println("hello");
	}
}
class Tg extends Tn{
	protected Tg(){
		System.out.println("mohit");
	}
	public static void main(String []args){
		Tg t=new Tg();
	}
}
	