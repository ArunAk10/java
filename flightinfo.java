import java.util.*;
class Flight{
	String fid;
	String depart;
	String arrival;
	double duration;
	boolean meal;
}
class flightinfo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Flight f1=new Flight();
		Flight f2=new Flight();
		Flight f3=new Flight();
		Flight f4=new Flight();
		Flight f5=new Flight();
		Flight f6=new Flight();
		Flight f7=new Flight();
		Flight[] f={f1,f2,f3,f4,f5,f6,f7};
		int i;
		for(i=0;i<f.length;i++)
		{
			f[i].fid=sc.next();
			f[i].depart=sc.next();
			f[i].arrival=sc.next();
			f[i].duration=sc.nextDouble();
			f[i].meal=sc.nextBoolean();
		}
      String dname=sc.next();
      String aname=sc.next();
      System.out.println("FlightId"+"\t"+"Duration"+"\t"+"Meal Available");
      for(i=0;i<f.length;i++)
      {
      	if(f[i].duration>120 &&f[i].meal==true)
      	{
      		System.out.println(f[i].fid+"\t\t"+f[i].duration+"\t\t"+f[i].meal);
      	}
      }
      System.out.println("----------------------------------------------------");
      System.out.println("FlightId"+"\t"+"Departure"+"\t"+"Arrival"+"\t\t"+"Duration");
      for(i=0;i<f.length;i++)
      {
      	if(f[i].depart.equalsIgnoreCase(dname) && f[i].arrival.equalsIgnoreCase(aname))
      	{
      		System.out.println(f[i].fid+"\t\t"+f[i].depart+"\t\t"+f[i].arrival+"\t\t"+f[i].duration);
      	}
      }
	}
}
/*AB13
Delhi
Mumbai
120
true
DCFS
Kolkata
Delhi
320
true
SAGH
Mumbai
Kolkata
250
false
BNVM
Delhi
Mumbai
140
true
BNSH
Patna
Delhi
230
true
BNDS
DElhi
Mumbai
240
true
BVCD
Chennai
Delhi
230
false
Delhi
Mumbai
*/