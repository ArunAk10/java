import java.util.*;
class sol2{
public static void main(String[] args)
{
Inventory i1=new Inventory();
Inventory i2=new Inventory();
Inventory i3=new Inventory();
Inventory i4=new Inventory();
Inventory in[]={i1,i2,i3,i4};
int i;
Scanner sc= new Scanner(System.in);
System.out.println(in.length);
for(i=0;i<in.length;i++)
{
in[i].iid=sc.next();
in[i].maxq=sc.nextInt();
in[i].curq=sc.nextInt();
in[i].thres=sc.nextInt();
}
int limit=sc.nextInt();
for(i=0;i<in.length;i++)
{
if(in[i].thres<=limit)
{
if(in[i].thres>=75)
{
System.out.println(in[i].iid+ " " + "critical filling");
}
else if(in[i].thres<=74&&in[i].thres>=50)
{
System.out.println(in[i].iid+ " " +"moderate filling");
}
else
{
System.out.println(in[i].iid+ " " +"non-critical filling");
}
}
}
}
}
class Inventory{
String iid;
int maxq;
int curq;
int thres;
}
