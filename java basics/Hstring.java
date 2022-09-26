class H{
	int x;
	H(){
		this(10);
		System.out.println(x++);
	}
	H(int i){
		x=i;
		System.out.println(x++);
		H();
	}
    void H(){
	 System.out.println(x++);
	}
	public static void main(String []args){
		H obj;
		new H().H();
	}
}






