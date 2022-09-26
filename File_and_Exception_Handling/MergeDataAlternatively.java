import java.io.*;

class MergeDataAlt{
	public static void main(String []args)throws IOException{
	    BufferedReader br1 = new BufferedReader(new FileReader("keshav.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("mahesh.txt"));
		PrintWriter    pw  = new PrintWriter("rakesh.txt");
        String s1=br1.readLine();
		String s2=br2.readLine();
		boolean b=true;
		while(s1!=null || s2!=null){
			if(s1!=null){
				pw.println(s1);
		       	s1=br1.readLine();
			}
			if(s2!= null){
                pw.println(s2);  				
		 	    s2=br2.readLine();
			}
        }
		pw.close();
		br1.close();
		br2.close();
	}
}	
		
		
		