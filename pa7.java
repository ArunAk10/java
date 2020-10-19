import java.util.*;
class sim{
int simid;
String customername;
double balance;
double rate;
String circle;
}

class pa7{
public static void main(String args[]){
sim s1=new sim();
sim s2=new sim();
sim s3=new sim();
sim s4=new sim();
sim s5=new sim();
sim s[]={s1,s2,s3,s4,s5};
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<s.length;i++)
{
s[i].simid=sc.nextInt();
s[i].customername=sc.next();
s[i].balance=sc.nextDouble();
s[i].rate=sc.nextDouble();
s[i].circle=sc.next();
}
String circle1,circle2;
circle1=sc.next();
circle2=sc.next();
int j=0;
double a[]=new double[5];
for(int l=0;l<s.length;l++)
{
a[l]=s[l].rate;
j++;
}
double temp=0;
for(int l=0;l<a.length;l++)
{
for(int k=0;k<a.length-1;k++)
{
if(a[k]<a[k+1])
{
temp=a[k];
a[k]=a[k+1];
a[k+1]=temp;
}
}
}
for(int l=0;l<a.length;l++)
{
for(int k=0;k<s.length;k++)
{
if(a[l]==s[k].rate)
{
if(s[k].circle.equals(circle1))
{
s[k].circle=circle2;
System.out.println(s[k].simid+" "+s[k].customername+" "+s[k].circle+" "+s[k].rate);
}
}
}
}
}
}




