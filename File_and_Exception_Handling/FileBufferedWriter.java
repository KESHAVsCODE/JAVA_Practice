import java.io.*;
 
class FileBufferedWriter{
	public static void main(String []args)throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("keshav.txt",true));
		bw.write('k');
		char ch[] = {'e','s','h','a','v'};
		bw.write(ch);
		bw.newLine();
		bw.write("chamria");
		bw.flush();
		bw.close();
	}
}
		
	