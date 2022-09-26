class A
{
	public void display()
	{
		System.out.println("HellO1");
	}
	public protected void show()
	{
		System.out.println("hellO2");
	}
    public static void main(String []args)
	{
		A ob=new A();
	    ob.display();
		ob.show();
	}	
}