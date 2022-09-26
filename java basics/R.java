class R{
	int x;
	R(){
		System.out.println(x++);
		R();
	}
	void R(){
		System.out.println(x++);
	}
	public static void main(String []args){
		new R().R();
	}
}















