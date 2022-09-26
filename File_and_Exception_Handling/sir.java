import java.io.*;

class Sir{
	void display(String path){
		File f = new File(path);
		String s[] = f.list();
		for(int i=0;i<s.length;i++){
			try{
				String cpath = path+"/"+s[i];
				File fr = new File(cpath);
				if(fr.isDirectory()){
					System.out.println("Dir : "+s[i]);
					display(cpath);
				}
				else
					System.out.println("File : "+s[i]);
			}
			catch(Exception e){}
		}
	}
	public static void main(String []args)throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter path : ");
		String path = br.readLine();
		Sir s = new Sir();
		s.display(path);
	}
}