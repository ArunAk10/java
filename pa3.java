import java.util.*;
class Associate{
String aid;
String aname;
String tech;
int years;
}
class pa3{
public static void main(String[] args){
Associate a1=new Associate();
Associate a2=new Associate();
Associate a3=new Associate();
Associate a4=new Associate();
Associate a5=new Associate();
Associate ar[]={a1,a2,a3,a4,a5};
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<ar.length;i++)
{
ar[i].aname=sc.next();
ar[i].aid=sc.next();
ar[i].tech=sc.next();
ar[i].years=sc.nextInt();
}
String th;
th=sc.next();
for(i=0;i<ar.length;i++)
{
if(ar[i].tech.equals(th) && ar[i].years%5==0)
{
System.out.println(ar[i].aid);}
}
}
}
