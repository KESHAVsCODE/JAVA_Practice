abstract class Demo1{
	public abstract void m1();
	public abstract void m2();
}
abstract class Demo2 extends Demo1{
	public void m1()
	{
	}
}
class Demo3 extends Demo2{
	public void m2()
	{
	}
}