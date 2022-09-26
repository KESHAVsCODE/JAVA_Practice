import java.io.*;

class FileClass{
	public static void main(String []args)throws IOException{
		
		File fr = new File("java example","home","New folder");
		String s[] = fr.list();
			System.out.println(s);
	/*	System.out.println(fr.length());
		System.out.println(fr.list());
		System.out.println("IS File exist ->"+fr.exists());
		System.out.println("create file"+fr.createNewFile());
        System.out.println("IS File exist ->"+fr.exists());
         System.out.println("IS File exist ->"+f2.exists());
		System.out.println("create file"+f2.createNewFile());
        System.out.println("IS File exist ->"+f2.exists());		
	*/	
	}
}