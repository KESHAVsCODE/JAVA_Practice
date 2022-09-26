import java.io.*;

class MergeAllFileData{
	public static void main(String []args)throws IOException{
		File f = new File("C:/Users/admin/Desktop/java example");
		PrintWriter pw = new PrintWriter("example.txt");
		String []s = f.list();
		for(String s1:s){
			System.out.println(s1);
			File fp = new File(f,s1);
			if(fp.isFile()){
				BufferedReader br = new BufferedReader(new FileReader(fp));
				String sr = br.readLine();
				while(sr!=null){
					pw.println(sr);
					sr=br.readLine();
				}
				br.close();
			}
		}
		pw.close();
    }
}