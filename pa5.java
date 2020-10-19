import java.util.*;
class movie{
String mname;
String cmpy;
String genre;
int budget;
}
class pa5{
public static void main(String[] args)
{
movie m1=new movie();
movie m2=new movie();
movie m3=new movie();
movie m4=new movie();
movie m[]={m1,m2,m3,m4};
int i;
Scanner sc=new Scanner(System.in);
for(i=0;i<m.length;i++)
{
m[i].mname=sc.next();
m[i].cmpy=sc.next();
m[i].genre=sc.next();
m[i].budget=sc.nextInt();
}
String key;
key=sc.next();
for(i=0;i<m.length;i++)
{
if(m[i].genre.equalsIgnoreCase(key) && m[i].budget>80000000)
{
System.out.println("High Budget Movie");
}
else if(m[i].genre.equalsIgnoreCase(key) && m[i].budget<80000000)
{
System.out.println("Low Budget Movie");
}
}
}
}


