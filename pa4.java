import java.util.*;
class pa4{
public static void main(String[] args){
int scount=0,ccount=0;
String str;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(int i=0;i<str.length();i++)
{
if(str.charAt(i)==' ')
{
scount++;
}
else
{
ccount++;
}
}
System.out.println("No of Spaces:"+scount+" and Characters:"+ccount);
}
}
