import java.io.*;

class FileCharWriter{
	public static void main(String []args)throws Exception{
		File f = new File("NCC folder","keshav.txt");
		FileWriter fw = new FileWriter(f,true);
		fw.write("hello my name is keshav");
		char ch[] = {'j','a','v','a','\n'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}
