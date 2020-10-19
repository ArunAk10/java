import java.util.*;
class Solution{
public static void main(String [] args){
String str;
int i;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(i=0;i<str.length();i++)
{
if(str.charAt(i)==' ')
{
System.out.print(str.charAt(i-1));
}
}
System.out.print(str.charAt(str.length()-1));
}
}
