import java.io.*;

class FilePrintWriter{
	public static void main(String []args)throws IOException{
		PrintWriter pw = new PrintWriter("mahesh.txt");
		pw.write(100);/// add corosponding char which is d
		pw.println('k');
		pw.println(100);
		pw.println(10.3);
		pw.println(1.12345678910111);   
		pw.println("keshav");
		pw.flush();
		pw.close();
	}
}
