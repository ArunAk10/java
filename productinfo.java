import java.util.*;
class Products{
	int pid;
	String pname;
	int qty;
	int price;
}
class productinfo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Products p1=new Products();
		Products p2=new Products();
		Products p3=new Products();
		Products p4=new Products();
		Products p5=new Products();
		Products[] p={p1,p2,p3,p4,p5};
		int i;
		for(i=0;i<p.length;i++)
		{
			p[i].pid=sc.nextInt();
			p[i].pname=sc.next();
			p[i].qty=sc.nextInt();
			p[i].price=sc.nextInt();
		}
		int totalprice=0;
		for(i=0;i<p.length;i++)
		{
			totalprice=totalprice+(p[i].price*p[i].qty);
		}
		System.out.println("Total Cart Price:"+totalprice);
		int arr[]=new int[p.length];
		for(i=0;i<p.length;i++)
		{
			arr[i]=p[i].price;
		}
		for(i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++)
		{
			for(int j=0;j<p.length;j++)
			{
				if(arr[i]==p[j].price)
				{
					System.out.println(p[j].pname+"\t\t"+p[j].price);
				}
			}
		}

	}
}
/*105
mobile
5
14000
205
laptop
6
30000
306
desktop
7
13000
407
watch
8
1000
655
printer
6
14500
*/