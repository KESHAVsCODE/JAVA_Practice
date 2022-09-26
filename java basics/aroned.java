class O{
	public static void main(String []args){
		int a[]={1,2,3,4,5};
		int b[]={2,9,8};
		a=b;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]++ +" "+b[i]);
		}
	}
}
