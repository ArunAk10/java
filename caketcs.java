import java.util.*;
class Cake{
	int cakeid;
	String cakename;
	int pound;
	double priceper;
	boolean eggless;
}
class caketcs{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cake c1=new Cake();
		Cake c2=new Cake();
		Cake c3=new Cake();
		Cake c4=new Cake();
		Cake c5=new Cake();
		Cake[] c={c1,c2,c3,c4,c5};
		int i;
		for(i=0;i<c.length;i++)
		{
			c[i].cakeid=sc.nextInt();
			c[i].cakename=sc.next();
			c[i].pound=sc.nextInt();
			c[i].priceper=sc.nextDouble();
			c[i].eggless=sc.nextBoolean();
		}
		double amount=0.0;
		for(i=0;i<c.length;i++)
		{
			if(c[i].eggless==true)
			{
				amount=amount+(c[i].pound*c[i].priceper)+50;
			}
			else
			{
				amount=amount+(c[i].pound*c[i].priceper);
			}
		}
		amount=amount+(amount*0.02);
		System.out.println("Total Price:"+amount);
		for(i=0;i<c.length;i++)
		{
			if(c[i].eggless==true)
			{
				System.out.println(c[i].cakeid+":"+c[i].cakename);
			}
		}

	}
}
/*323
ABC
5
300
true
768
BAJ
7
200
false
565
BNC
3
500
true
454
ACC
8
454
true
989
JHK
8
500
false*/
