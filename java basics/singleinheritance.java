class U{
	int x;
	U(){
		this(10);
		System.out.println(x++);
	}
	U(int i){
		System.out.println(x+++" "+i);
	}
	void display(){
		System.out.println(x++);
	}
}	
class UU extends U{
	UU(){
		System.out.println(x++);
	}
	void UU(){
		System.out.println(x++);
	}
	public static void main(String []args){
	UU obj=new UU();
	obj.display();
	obj.UU();
	}
}
    	
	