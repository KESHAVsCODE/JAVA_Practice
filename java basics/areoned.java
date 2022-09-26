class OO{
	void show(int a[]){
		int b[]={9,10,6};
		a=b;
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]++ +b[i]);
		}
	}
	public static void main(String []args){
		OO obj=new OO();
		int a[]={1,7,6,8,20};
		obj.show(a);
        for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
        }
    }
}	
	 