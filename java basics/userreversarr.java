import java.util.*;
class AA{
	public static void main(String []args){
		int a[]={1,7,6,8,2,9,4,1,5};
		int first=0,second=0,start=0,end=0,i,j,t=0,flag=0;
		Scanner sc=new Scanner(System.in);
		end=a.length-1;
		System.out.println("enter first value");
		first=sc.nextInt();
		System.out.println("enter second value");
		second=sc.nextInt();
		for(i=0;i<a.length;i++){
			if(a[i]==first&&flag==0){
				flag=1;
				start=i;
			}
			else if(flag==1&&a[i]==second){
				end=i;
				break;
			}
		}
		if(flag==1){
			for(i=start,j=end;i<
			j;i++,j--){
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}