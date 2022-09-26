import java.io.*;
import java.util.Scanner;

class FoundFile{
	public int d,f;
    public FoundFile(){
        d=0;f=0;
    }		
	public void isDirectoryGo(File fr){			
		String []s = fr.list();
		for(String s1 : s){
			try{
			        File fp = new File(fr,s1);
		            if(fp.isDirectory()){
						System.out.println("Dir -> "+fp);
				        isDirectoryGo(fp);
                        d++;						
		            }
			        else{               				
				        System.out.println("  File -> "+fp.getName());
				        f++;
			        }
			}
			catch(Exception e){
				System.out.println(e);
			}
	    }
    }		
	public static void main(String []args)throws IOException{
		Scanner sc = new Scanner(System.in);
		FoundFile ff = new FoundFile();
		String sr =sc.nextLine();
		File fp = new File(sr);
		if(fp.exists()){
		    ff.isDirectoryGo(fp);
			System.out.println("Number of folder is ->"+ff.d);
			System.out.println("Number of File is ->"+ff.f);
		}
		else
			System.out.println("Invalid Directory or File");
	}
}
	   
					
		