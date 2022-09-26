class E{
	int x;
	E(){
	System.out.println(x);
	E();
	}
	
	void E(){
		System.out.println(x++);
	}
	public static void main(String []args){
		E obj=new E();
		
	}
}

