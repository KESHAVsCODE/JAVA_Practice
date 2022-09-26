import java.io.*;

class FileCharArrReader{
	public static void main(String []args)throws IOException{
		File f = new File("NCC folder","keshav.txt");
		FileReader fr = new FileReader(f);
		System.out.println(f.length());
		char []arr = new char[(int)f.length()];
		System.out.println(fr.read(arr));
		for(char ch:arr)
			System.out.print(ch);
		fr.close();
	}
}