import java.io.*;

class FileCharReader{
	public static void main(String []args) throws IOException{
		FileReader fr = new FileReader("keshav.txt");
		int i=fr.read();
		while(i!=-1){
			System.out.print((char)i);
            i=fr.read();			
		}
		fr.close();
		//System.out.println((char)System.in.read());
		//System.out.println("hello");
	}
}