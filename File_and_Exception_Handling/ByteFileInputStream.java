import java.io.*;

class ByteFileInputStream{
	public static void main(String []args)throws IOException{
		File f = new File("keshav.txt");
		FileInputStream fin = new FileInputStream("keshav.txt");
	/*	int i=fin.read();
		while(i!=-1){
		    System.out.print((char)i);
	        i=fin.read();
		}
	*/
	    System.out.println(fin.skip(4));
		System.out.println(fin.available());
		byte []b = new byte[(int)f.length()];
		fin.read(b);
		for(int i=0;i<b.length;i++)
			System.out.print((char)b[i]);
		
		
		fin.close();
	}
}	
		