import java.io.*;

class FileDir{
	public static void main(String []args){
		File fr = new File("Exa.java");
	 	System.out.println(fr);
		System.out.println(Files.getFileExtension("Exa.java"));
   	   /*	String s[]=fr.list();
		for(String s1:s)
			System.out.println(s1);
		System.out.println(fr.exists());
		System.out.println(fr.mkdir());
		System.out.println(fr.exists());*/
	}
}