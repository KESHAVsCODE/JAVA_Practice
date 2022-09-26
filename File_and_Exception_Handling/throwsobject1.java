class throwsob2{
	public static void main(String []args)throws InterruptedException
	{
		doStuff();
		System.out.println("hello1");
	}
	public static void doStuff()throws InterruptedException
	{
		doMoreStuff();
		System.out.println("hello2");
	}
	public static void doMoreStuff()throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("hello3");
	}
}