package swaglabdemo;

import java.util.List;
import java.util.Scanner;

public class javaprogramms {

	private static javaprogramms jayu;
	private Object printsomthing;

	public static void main(String[] args) {
		javaprogramms jayu=new javaprogramms();
		//jayu.printsomthing();
		//jayu.reversewords();
        //jayu.reverse();
        //jayu.reverse2();
		//jayu.evenno();
		//jayu.missingno();
	    //jayu.starpattern1();
		//jayu.starpattern2();
	    //jayu.starpattern3();
	    //jayu.starpattern4();
		//jayu.armstrongno();
		//jayu.countstring();
		//jayu.fabonacciseries();
		//jayu.factorialno();
		//jayu.duplicatenoarray();
		jayu.largestnofromarray();
	}

	public void printsomthing()
	{
		String a="Hello world";
		System.out.println(a);
		
	}
	
	public void reversewords()
	{
		String name ="jayashri jayant borude";
		String[] a=name.split(" ");
	
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}	
	}
	public void reverse()
	{
		String a= "jayant";
	//String reverse=" ";
	char b[]=a.toCharArray();
		 for(int i=b.length-1;i>=0;i--)
		 {	
			 System.out.print(b[i]);
		 }
		// System.out.println(reverse); 
	}
	
	public void reverse2()
	{
		String a= "jayant";
        StringBuffer c=new StringBuffer(a);
       System.out.println(c.reverse());
	}
	
	public void evenno()
	{
		int a[] = {1,2,3,4,5,6,7,8,9,10};
	//normal for loop                                        
		for(int i=0;i<a.length;i++)                              
		{ 
			if(a[i]%2==0)
			    System.out.println("even no="+a[i]);
		}
		
		for(int i=0;i<a.length;i++)
		{ 
			if(a[i]%2!=0)
			    System.out.println("odd no="+a[i]);
		}
	
	 //enhanced for loop
	    for(int value:a)
	    { 
			if(value%2==0)
			    System.out.println("even no="+value);
		}	
	    for(int value:a)
	    { 
			if(value%2!=0)
			    System.out.println("odd no="+value);
		}	
		
		
	}
	
	public void missingno()
	{//find missing no
		int[] a= {1,2,3,4,6,7,8,9,10};
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of array elements="+sum1);
		int sum2=0;
		for(int i=0;i<=10;i++)
		{
		 sum2=sum2+i;
		}
		System.out.println("sum of array+missing elements="+sum2);
		int c=sum2-sum1;
		System.out.println("missing no is="+c);
	}
	
public void starpattern1()
	{
	   for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
		}

		System.out.println();
		}
	}
	
public void starpattern2()	
{     for(int i=1;i<=4;i++)
	{
	 for(int j=4; j>=i; j--)
	 {
	System.out.print("*");
	}
	 System.out.println();
	}
}
	
public void starpattern3()		
{
	for(int i=1;i<=4;i++)
	{
	for(int j=3;j>=i;j--)
	{
		System.out.print(" ");
	}
	
	for(int k=1;k<=i;k++)
	{
	System.out.print("*");
	}
	System.out.println();	
	}
	
}
public void starpattern4()		
{
	for(int i=1;i<=4;i++)
	{
	for(int j=2;j<=i;j++)
	{
		System.out.print(" ");
	}
	
	for(int k=4;k>=i;k--)
	{
	System.out.print("*");
	}
	System.out.println();	
	}
	
}

public void armstrongno()
{
	int n;
	Scanner Sc = new Scanner(System.in);
	System.out.println("Enter nno:");
	n=Sc.nextInt();
	int n1=n;
	int b;
	int sum=0;
	while(n>0)
	{
		b=n%10;
		sum=sum+(b*b*b);
		n=n/10;
	}
if(sum==n1)
{
	System.out.println("It is a armstrong no:"+n1);
}
else
{
	System.out.println("It is not a armstrong no:"+n1);
}
}

public void countstring()
{
	String a ="jayashri";
	int b=a.length();
	System.out.println(b);
}
public void fabonacciseries()
{
	int a=0;
	int b=1;
	int c;
	for(int i=1;i<=10;i++)
	{
	    c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}	
}

public void factorialno()
{
	int a=3;
	int factorial=1;
	for(int i=1;i<=a;i++)
	{
		factorial=factorial*i;
	}
	System.out.println("factorail of no is="+factorial);
}

public void duplicatenoarray()
{
	String a[]={"java","python","java","c","c++"};
	 for(int i=0;i<=a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 System.out.print(a[i]);
			 }
		 }	 
     }
}

public void largestnofromarray()
{
	int a[]= {1,3,6,7,9,12};
	int n=0;
	for(int i=0;i<=a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if (a[i]<a[j])
			{
				n=a[j];
			}
		}	
	}
	System.out.println(n);	
}

public void primeno()
{
	int a=
}
}

























	
	
	

