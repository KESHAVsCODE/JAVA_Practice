import java.io.*;

class MergeData{
	public static void main(String []args)throws IOException{
	    BufferedReader br1 = new BufferedReader(new FileReader("keshav.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("mahesh.txt"));
		PrintWriter    pw  = new PrintWriter("rakesh.txt");
        String s=null;
		while((s = br1.readLine())!=null){
			pw.println(s);
        }
		while((s = br2.readLine())!=null){
			pw.println(s);
        }
		pw.close();
		br1.close();
		br2.close();
	}
}	
		
		
		