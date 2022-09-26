class FTT{
	public static void main(String []args){
		int p=1,m=1,n=1,d=-1,x=1,e=1;
		for(int i=1;i<=6;i++){
			m=n;
			e=i%2;
			if(i%2==1)
				p=-1;
				else
					p=1;
				for(int j=1;j<=i;j++){
					System.out.print(m);
					m=m+e;
					e=e+p;
					p=-p;
				}
				n=n+x;
				x=x+d;
				d=-d;
				System.out.println();
		}
	}
}
			