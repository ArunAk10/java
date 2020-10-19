import java.util.*;
class pa6{
public static void main(String[] args){
String str;
int i;
Scanner sc=new Scanner(System.in);
str=sc.nextLine();
for(i=0;i<str.length();i=i+2)
{
System.out.print(str.charAt(i));
}
}
}