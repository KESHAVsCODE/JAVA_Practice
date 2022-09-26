class Student{
	void showRoll(int roll){
		System.out.println(roll);
	}
}
abstract class Person extends Student{
    abstract void display(int age);
	public static void main(String []args)
	{		
	Student s=new Student();
	s.showRoll(24);
	}
}
class Faculty extends Person{
	public void display(int age)
	{
	System.out.println(age);
    }
	public static void main(String []args)
	{
		Faculty f=new Faculty();
		f.display(29);
		f.showRoll(55);
	}	
}

	