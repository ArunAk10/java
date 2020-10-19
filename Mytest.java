import java.util.*;
class Mytest{
	public static void main(String[] args) {
		String s[]={"Java","C","C++","Java"};
		Arrays.sort(s);
		for(String i:s){
			System.out.print(i+" ");
		}
		int c[]=new int[s.length];
		for(int j=0;j<s.length;j++)
			{
				System.out.println(c[j]);
					if(c[j]!=0)
					{
						c[j]=c[s[j]+1;
					}
					else
					{
						c[j]++;
					}
			}

		for(int j=0;j<s.length;j++)
		{
			
			System.out.println(s[j]+""+c[j]);
			}

	}
}