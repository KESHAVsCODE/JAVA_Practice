import java.io.*;

class FilePointingDir{
	public static void main(String []args){
		File fr=new File("c:/users/admin/desktop/java example");
		System.out.println(fr.isDirectory());

		String []s=fr.list();
		int count=0;
		for(String s1:s){
            File fp = new File(s1);
            if(fp.isFile()){				
			    System.out.println(s1);
			    count++;
			}
		}
		System.out.println(count);
		System.out.println(fr.length());
	}
}
