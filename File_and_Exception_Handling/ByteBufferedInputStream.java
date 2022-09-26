import java.io.*;

class ByteBufferedInputStream {
	public static void main(String []args)throws IOException{
		BufferedInputStream bin = new BufferedInputStream(new FileInputStream("keshav.txt"));
		System.out.println(bin.available());
		byte b[] = new byte[(int)bin.available()];
		bin.read(b);
		for(byte b1: b)
			System.out.print((char)b1);
	//	boolean b = bin.markSupported();
	//	System.out.println(b);
	//	if(b)
		//	bin.mark(2);
		 //       bin.skip(4); 
    ///    System.out.println("FileContents :"); 
        
    //    System.out.println((char)bin.read());
    //    bin.mark(1);
	//	int ch=0;
    /*    while((ch=bin.read())!=-1)
			System.out.print((char)ch);
        bin.reset(); 
        System.out.println((char)bin.read());*/   
        bin.close(); 
	}
}