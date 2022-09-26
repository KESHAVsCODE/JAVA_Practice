import java.io.*;

class ByteFileOutputStream{
	public static void main(String []args)throws IOException{
		FileOutputStream fout = new FileOutputStream("keshav.txt",true);
		fout.write('\n');
		char []ch = {'k','e','s','h','a','v'};
		for(int i=0;i<ch.length;i++)
		fout.write(ch[i]);
	
	    byte b[] = {'1','2','4'};
	    fout.write(b);
		
		fout.write('\n');
		try{
		byte b1[] = {'1','2','3','4','5','6','7','8','9'};
		fout.write(b1,2,5);
		}
		finally{
			
		fout.flush();
		fout.close();
		}
	}
}