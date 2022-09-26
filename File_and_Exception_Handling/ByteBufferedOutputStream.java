import java.io.*;

class ByteBufferedOutputStream{
	public static void main(String []args)throws IOException{
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("keshav.txt",true));
		bout.write('\n');
		bout.write(100);
		bout.write('\n');
		bout.write('d');
		bout.write('\n');
		byte b[] = {'1','2','3','4','5','6','7','8'};
		bout.write(b);
		bout.write('\n');
		bout.write(b,3,5);
			bout.close();
	}
}

		