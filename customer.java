import java.util.*;
class customerinformation{
	int cid;
	String cname;
	double bill;
	int noofitems;
	String branchname;
}
public class customer{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		customerinformation c1=new customerinformation();
		customerinformation c2=new customerinformation();
		customerinformation c3=new customerinformation();
		customerinformation c4=new customerinformation();
		customerinformation c[]={c1,c2,c3,c4};
		int i;
		for(i=0;i<c.length;i++)
		{
			c[i].cid=sc.nextInt();
			c[i].cname=sc.next();
			c[i].bill=sc.nextDouble();
			c[i].noofitems=sc.nextInt();
			c[i].branchname=sc.next();
		}
		double avg,sum=0;
		int f=0;
		String bname=sc.next();
		double bamount=sc.nextDouble();
		char sol=sc.next().charAt(0);
		for(i=0;i<c.length;i++)
		{
			if(c[i].branchname.equalsIgnoreCase(bname))
			{
				sum=sum+c[i].bill;
				f++;
			}
		}
		if(sum==0){
			System.out.println(0);
		}
		else
		{
			avg=sum/f;
			System.out.println((int)avg);
		}
		
		for(i=0;i<c.length;i++)
		{
			char temp=c[i].cname.charAt(0);
			if(temp==sol)
			{
				if(c[i].bill>=bamount)
				{
					c[i].bill=c[i].bill-c[i].bill*0.2;
				}
				else
				{
					c[i].bill=c[i].bill-c[i].bill*0.1;
				}
				System.out.println(c[i].cname+":"+c[i].bill);
			}
		}
	}
}
/*111
priya
5000
10
Adayar
222
Divya
6000
12
Adayar
333
Minu
4000
20
Adayar
444
Seetha
2000
10
Annanagar
Adayar
5000
111
priya
5000
10
Adayar
222
Divya
6000
12
Adayar
333
Minu
4000
20
Adayar
444
Seetha
2000
10
Annanagar
Adayar
5000
p*/