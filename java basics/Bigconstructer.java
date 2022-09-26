class TT{
	int x=10;
	TT(){
		this(7);
		System.out.println(x++);
	}
	TT(int i){
		System.out.println(x++);
		x=x+i;
	}
	NN TT(){
		System.out.println(x++);
		return new NN();
	}
}
class NN extends TT{
	NN(){
		this(7,8);
		System.out.println(x++);
	}
	NN(int i,int j){
		System.out.println(x++);
		x=i+j;
	}
    MM NN(){
		System.out.println(x++);
		return new MM();
	}
}
class MM extends NN{
	void MM(){
		System.out.println(x++);
	}
	public static void main(String []args){
		new MM().TT().NN().MM();
	}
}
	
	
		