package practice;
import java.util.Scanner;

public class starpattern {
	public void starp1(){
	//Scanner sc = new Scanner(System.in);	
	//System.out.println("enter name=");
	//String s1=sc.nextLine();
	
		
		String s2= "mmm";
		String s="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			s=s+s2.charAt(i);
			
		}
		System.out.println(s);
		if (s.equalsIgnoreCase(s2))
		{
			System.out.println("it is a pd string:"+s);
		}
		else
		{
			System.out.println("it is not a pd string:"+s);
		}
	}
	
	public static void main(String[] args) {
		starpattern a=new starpattern();
		a.starp1();

	}

	

}
