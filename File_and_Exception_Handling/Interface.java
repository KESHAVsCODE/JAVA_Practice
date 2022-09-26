interface Demo{
    abstract void f1();
	abstract void f2();
}
abstract class Example implements Demo{
	public void f1()
	{
		System.out.println("f1");
	}
}
class Example2 extends Example{
	 public void f2()
	{
		System.out.println("f2");
	}
	public static void main(String []arr)
	{
		Example2 e=new Example2();
	    e.f2();
		e.f1();
	}
}