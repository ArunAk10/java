import java.util.*;
class People{
	int wardno;
	String pname;
	int age;
	String village;
	String taluk;
}
class peopletcs{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		People p1=new People();
		People p2=new People();
		People p3=new People();
		People p4=new People();
		People p[]={p1,p2,p3,p4};
		int i;
		for(i=0;i<p.length;i++)
		{
			p[i].wardno=sc.nextInt();
			p[i].pname=sc.next();
			p[i].age=sc.nextInt();
			p[i].village=sc.next();
			p[i].taluk=sc.next();
		}
		String vill=sc.next();
		int wno=sc.nextInt();
		int f=0;
		int sum=0,c=0;
		for(i=0;i<p.length;i++)
		{
			if(p[i].village.equalsIgnoreCase(vill))
			{
				f=1;
				if(p[i].age>=18)
				{
					sum=sum+p[i].age;
					c++;

				}
			}
		}
		if(f==0)
		{
			System.out.println("There are no eligible people in the village");
		}
		else
		{
			System.out.println(sum/c);
		}
		int arr[]=new int[4];
		for(i=0;i<p.length;i++){
			if(p[i].wardno==wno)
			{
				arr[i]=p[i].age;
			}
		}
		for(i=0;i<p.length;i++)
		{
			if(p[i].age==arr[i])
			{
				System.out.println(p[i].pname);
			}
		}

		
	}
}
/*
1001
Raj
18
skp
aaa
1002
Jack
24
skp
bbb
1001
Daniel
80
skp
aaa
1004
Kim
12
kkp
bbb
skp
1001
*/