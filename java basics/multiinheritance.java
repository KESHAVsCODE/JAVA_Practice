class Q{
	int x;
	Q(){
		this(10);
		System.out.println(x++);
	}
	Q(int i){
		System.out.println(x+++" "+i);
	}
	W Q(){
		System.out.println(x++);
		return new W();
	}
}
class W extends Q{
	W(){
		System.out.println(x++);
	}
	E W(){
		System.out.println(x++);
		return new E();  
	}
}
class E extends W{
	E(){
		system.out.println(x++);
	}
	void E(){
		System.out.println(x++);
	}
	public static void mian(String []args){
		new E().Q().W().E();
	}
}
		
