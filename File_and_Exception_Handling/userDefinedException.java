import java.util.*;
import java.io.*;

class User extends Exception
{
	String s=null;
	public User(String s)
	{
		this.s=s;
	}
	public String getMessage()
	{
		return s;
	}
}	
class A{
	public static void main(String []args)throws IOException
	{	  
        int b =2000;
        int w= 3000;
        try{
			if(w>b){
				throw new User("insuffisuientbalav");
			}
			b=b-w;
			System.out.println("transaction successful");
		}
		catch(User e)
		{
			System.out.println(e.getMessage());
		}
	}
}
                   
				   


		
		