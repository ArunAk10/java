import java.util.*;
class book{
	int bid;
	String bname;
	String sub;
	int bprice;
}
class bookinfo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		book b1=new book();
		book b2=new book();
		book b3=new book();
		book b4=new book();
		book [] b={b1,b2,b3,b4};
		String[] arr=new String[b.length];
		int i;
		for(i=0;i<b.length;i++)
		{
			b[i].bid=sc.nextInt();
			sc.nextLine();
			b[i].bname=sc.nextLine();
			b[i].sub=sc.nextLine();
			b[i].bprice=sc.nextInt();
			sc.nextLine();
			arr[i]=b[i].sub;
		}
		int iid=sc.nextInt();
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(i=0;i<arr.length;i++)
		{
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i],1);
			}
		}
		ArrayList<String> s=new ArrayList<String>(hm.keySet());
		Collections.sort(s);
		for(String j:s)
		{
			System.out.println(j+""+hm.get(j));
		}
	 for(i=0;i<b.length;i++)
	 {
	 	if(iid==b[i].bid)
	 	{
	 		if(b[i].bprice>=1000)
	 		{
	 			System.out.println("High Price");
	 		}
	 		else if(b[i].bprice>=750 && b[i].bprice<1000)
	 		{
	 			System.out.println("Medium Price");
	 		}
	 		else if(b[i].bprice>=500 && b[i].bprice<750)
	 		{
	 			System.out.println("Average Price");
	 		}
	 		else{
	 			System.out.println("Low Price");
	 		}
	 	}
	 }

		
	}
}
/*
101
Thinking in Java
Java
1250
102
Let us C
C
500
103
Java complete reference 
Java
1000
104
Let us C++
C++
350
102*/