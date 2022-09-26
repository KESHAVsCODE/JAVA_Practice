import java.io.*;

class FileBufferedReader{
	public static void main(String []args)throws IOException{
		File f= new File("NCC folder","4th-sem-marking.pdf");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		System.out.println(f.length());
	    
		System.out.println((char)br.read());
		
		int length = (int)f.length();
		char ch[] = new char[length];
		System.out.println(br.read(ch));
		for(char c:ch)
			System.out.print((char)c);
		
	/*	String s = br.readLine();
		while(s!=null){
			System.out.println(s);
			s=br.readLine();
		}*/
		br.close();
	}
}
			