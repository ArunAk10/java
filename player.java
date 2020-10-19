import java.util.*;
class Pla{
	int pid;
	String pname;
	int iccrank;
	int mat;
	int runs;
}
public class player{
	public static void main(String[] args){
		Pla p1=new Pla();
		Pla p2=new Pla();
		Pla p3=new Pla();
		Pla p4=new Pla();
		Pla p[]={p1,p2,p3,p4};
		int i;
		Scanner sc=new Scanner(System.in);
		for(i=0;i<p.length;i++)
		{
			p[i].pid=sc.nextInt();
			p[i].pname=sc.next();
			p[i].iccrank=sc.nextInt();
			p[i].mat=sc.nextInt();
			p[i].runs=sc.nextInt();
		}
     int target;
     target=sc.nextInt();
     int runrate=0;
     for(i=0;i<p.length;i++)
     {
     	if(p[i].mat>=target)
     	{
     		runrate=(int)p[i].runs/p[i].mat;
     		System.out.println(runrate);

     	
     	if(runrate>=80){
     		System.out.println("Grade A player");
     	}
     	else if(runrate<=79 && runrate>=50){
     		System.out.println("Grade B player");
     	}
        else{
        	System.out.println("Grade C player");
        }

}

     }
	}
}