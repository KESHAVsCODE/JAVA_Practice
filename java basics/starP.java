class StarP{
	public static void main(String arr[]){
		System.out.println("hello");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++)
				if(j>=i&&j<=4)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.print("\n");
		}
	}
}