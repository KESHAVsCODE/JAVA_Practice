
class SP{
	public static void main(String []args){
	int i,j,t;
	int a[]={9,7,11,6,2,3};
	for(i=0,j=a.length-1;i<j;i++,j--){
		t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
	for(i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
	
	}
}

	