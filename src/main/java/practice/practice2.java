package practice;

import java.util.ArrayList;
import java.util.Iterator;

import swaglabdemo.practice3;

public class practice2 
{
	public static void main(String[] args) 
{
		//practice2 sd=new practice2();
		practice3 b=new practice3();
		b.show();
		//sd.reversstring();
		//sd.reversstring2();
		//sd.palimdromestring();
		//sd.numberpalimdrome();
		//sd.armstrongno();
		//sd.factorialno();
		//sd.starp1();
		//sd.duplicateitem();
		//sd.stringmethods();
}
	void show1()
	{
		System.out.println(a);
	}
	public void reversstring()
	{
	
		StringBuffer st =new StringBuffer("jayant");
			System.out.println(st.reverse());
			
	}
	public void reversstring2()
	{
		String a= "jayant";
		char[] b=a.toCharArray();
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]);
		}
		
	}
	
	public void palimdromestring()
	{
		String a= "mam";
		String name="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char b= a.charAt(i);
			name=name+b;
		}
		if(name.equalsIgnoreCase(a))
		{
			System.out.println("String is palimdrome");
		}
		else
		{
			System.out.println("String is not palimdrome");
		}
	}
	
	public void numberpalimdrome()
	{
		int a=122;
		int b=a;
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		System.out.print(sum);
		if(b==sum)
		{
			System.out.println("No. is palimdrome:"+b);
		}
		else
		{
			System.out.println("No is not palimdrome:"+b);
		
		}
		
	}
	
	public void armstrongno()
	{
		int a=153;
		int b=a;
		int len=0;
		
		while(a!= 0)
		{
			len=len+1;
			a=a/10;
		}
		System.out.println("length of no:"+len);
		int a1=b;
		int sum=0;
		while(a1!= 0)
		{
			
			int rem=1;
			int c=a1%10;
			for(int j=1;j<=len;j++)
				{
				rem=rem*c;
				}
		 sum=sum+rem;
		 System.out.println(sum);
			a1=a1/10;
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.println("No. is armstrong:"+b);
		}
		else
		{
			System.out.println("No. is not armstrong:"+b);
		}
	}
	
public void factorialno()
{
	int a=1;
	int sum=1;
	for(int i=1;i<=a;i++)
	{
		sum=sum*i;
	}
	System.out.println("factorial value="+sum);
}

public void starp1()
{ 
	for(int i=0;i<=4;i++)
	{
			for(int j=4;j>=i;j--)
		    {
		    System.out.print(" ");
		    }
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int h=0;h<i;h++)
		    {
		    System.out.print("*");
		    }
	    System.out.println();  
	}
	for(int i=0;i<=4;i++)
	{
			for(int j=0;j<=i;j++)
		    {
		    System.out.print(" ");
		    }
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int h=4;h>i;h--)
		    {
		    System.out.print("*");
		    }
	    System.out.println();  
	}
	
}
public void duplicateitem()
{
	ArrayList<String> b=new ArrayList<String>();
	b.add("jay");
	b.add("jayu");
	b.add("jay");
    Iterator<String> c= b.iterator();
    while(c.hasNext())
    {{System.out.println(c.next());}}
}
	
 public void stringmethods()
 {
	 String a= "      jayu      ";
	 String b="jay";
	 System.out.println(a.concat(b));
	 System.out.println(a.strip());
	 System.out.println(a.replace("jayu", "jay"));
	char[]c= b.toCharArray();
	System.out.println(c[1]);
	 System.out.println(a.trim());
	 
 }



}
	




	

	
	

