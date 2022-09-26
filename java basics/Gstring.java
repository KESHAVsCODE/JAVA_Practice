class Gs{
	int x,y;
	Gs(int i,int j){
	  x=i;
	  y=j;
	}
	void display(){
		System.out.println(x+" "+y);
	}
	public static void main(String []args){
		Gs obj=new Gs(5,6);
		obj.display();
	}
}
	  
	