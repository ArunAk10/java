import java.util.*;
class Books{
	int id;
	String title;
	String author;
	double price;
}
class bookstore{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Books b1=new Books();
		Books b2=new Books();
		Books b3=new Books();
		Books b4=new Books();
		Books[] b={b1,b2,b3,b4};
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i].id=sc.nextInt();
			b[i].title=sc.next();
			b[i].author=sc.next();
			b[i].price=sc.nextDouble();
		}
		double min=sc.nextDouble();
		double max=sc.nextDouble();
		for(i=0;i<b.length;i++)
		{
			if(b[i].price>min && b[i].price<max)
			{
				System.out.println(b[i].id);
			}
		}
	}
}
/*232
Flamingo
abc
400
432
udan
BAC
500
321
Snapshot
MNV
200
675
Rajniti
BPV
900
200
800
*/
