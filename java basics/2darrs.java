class PT{
	public static void main(String []args){
		int a[]={7,8,2,9};
		int b[][]={a,{1,2,3,},a,{4,5,7,},new int[2]};
		a=b[1];
		b[1]=b[2];
		b[2]=b[4];
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				System.out.print(b[i][j]++ +" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}
}