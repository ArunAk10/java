import java.util.*;
class Mobile
{
  String imeicode;
  boolean issinglesim;
  String processor;
  double price;
  String manufacturer;
}
class mobilestore{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        Mobile m1=new Mobile();
        Mobile m2=new Mobile();
        Mobile m3=new Mobile();
        Mobile m4=new Mobile();
        Mobile m5=new Mobile();
        Mobile[] m={m1,m2,m3,m4,m5};
        int i;
        for(i=0;i<m.length;i++)
        {
            m[i].imeicode=sc.nextLine();
            m[i].issinglesim=sc.nextBoolean();
            m[i].processor=sc.nextLine();
            sc.nextLine();
            m[i].price=sc.nextDouble();
            sc.nextLine();
            m[i].manufacturer=sc.nextLine();
        }
    int c=0;
    double per=sc.nextDouble();
    sc.nextLine();
    String man=sc.nextLine();
    for(i=0;i<m.length;i++)
    {
        if(m[i].imeicode.length()==15 && m[i].issinglesim==true)
        {
            c=c+1;
        }
    }
    System.out.println(c);

    int f=0;
    for(i=0;i<m.length;i++)
    {
        if(m[i].manufacturer.equalsIgnoreCase(man))
        {
            f=1;
            m[i].price=m[i].price-(m[i].price*per)/100;
        }
    }
    double arr[]=new double[5];
    for(i=0;i<m.length;i++)
    {
        if(m[i].manufacturer.equalsIgnoreCase(man))
        {
        arr[i]=m[i].price;
    }}
    Arrays.sort(arr);
    for(i=0;i<m.length;i++)
    {
        if(m[i].price==arr[m.length-1])
        {
            System.out.println(m[i].imeicode+"@"+m[i].price);
        }
    }
    if(f==0)
    {
        System.out.println("No mobile found");
    }
    }

}
/*090909090909088
true
Kirin 990 4G
58955
Xiaomi Redmi 6A
888887777755555
true
Exynos 990
76555
Samsung Galaxy S20 Ultra	
998899889988
false
Exynos 990
14000
Samsung Galaxy S20
989898989898989
true
Kirin 990 4G
30000
Huawei Honor 7
99999777778888
true
MT6732
58900
Xiaomi Redmi 6A
25
Xiaomi Redmi 6A*/