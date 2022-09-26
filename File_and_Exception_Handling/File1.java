import java.io.*;
class File1{
	public static void main(String []args){
		try{
		    FileInputStream fr=new FileInputStream("keshav.txt");
			int i,c=0,l=1,w=0;
			while(true){
				i=fr.read();
				if(i==-1)
					break;
				if(i!=10)
					c++;
				else{	
				System.out.println("LINE->"+(l++)+"  "+c+":character");
				c=0;
				}
			}
			fr.close();
		}
		catch(IOException f)
		{
			System.out.println(f);
		}
	}
}