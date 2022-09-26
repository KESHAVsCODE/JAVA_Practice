class D{
	int x;
	D(){
		this(10);
		System.out.println(x++);
	}
	D(int i){
		x=i;
		System.out.println(x++);
	}
	void show(){
		System.out.println(x++);
	}
}
class DD extends D{
	void DD(){
		System.out.println(x++);
	}
    public static void main(String []args){
	  DD obj=new DD();
	  obj.show();
	  obj.DD();
	}
}

