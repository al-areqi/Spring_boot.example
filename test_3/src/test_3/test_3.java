package test_3;

import java.util.Scanner;

public class test_3 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       // String s= in.next();
	      //int n = in.nextInt();
	     //int[] arr = new int[n];
//	     for(int arr_i = 0; arr_i < n; arr_i++){
//	       arr[arr_i] = in.nextInt();
//	     }
	     //   double x=2/3;
	       // System.out.println(x);
	   //  plusMinus(arr);
	        
	        //  boolean result= check_num_in_string(s);
	        //System.out.println(result);
	        System.out.println("eneter the number");
	        int n=in.nextInt();
	        System.out.println("The result is \n"+FirstFactorial(n));
	        
	     in.close();
	    }
	 
	 
	public static boolean check_num_in_string(String s)
	{
		boolean r= false;
		int i=0;
		int count =0;
		char [] char_array=s.toCharArray();
		for (int j=0; j<char_array.length; j++)
		if (Character.isDigit(char_array[j]) && j != char_array.length-1)
			{
				i=j+1;
		while (i!=-1) 
		{
			if (char_array[i]== '?') 
				{++count;
				++i;}
				else if(count>=3 &&Character.isDigit(char_array[i]))
				{
					r=true;
					i=-1;
				}
				else if (i==char_array.length-1)
					i=-1;	
				else 
					i=-1;
					
			}
		}
					
			return r;
		
		
	}
	
	static int count_sum(int n)
	{
		int count=0;
		for(int i=1; i<n; i++)
			{
			int j=i+1;
			int sum=i;
			
		while (j < n && sum<n)
		{
			sum=sum+j;
			j++;
			if (sum==n)
				++count;
		}
			}
		return count;
	
	}
	
	public static int FirstFactorial(int num) { 
		int num1;
	      if(num<=1)
	      return 1;
	      else 
	    num1= num*FirstFactorial(num-1);
	  return num1;
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       
	    
	    
	  } 
	static void plusMinus(int[] arr) {
	        double sump=0;
	        double sumn=0;
	        double sumz=0;
	        for (int i=0;i<arr.length;i++)
	            if(arr[i]>0)
	                ++sump;
	        else if (arr[i]<0)
	            ++sumn;
	        else if(arr[i]==0)
	            ++sumz;
	       
	         double fp=(sump/arr.length);
	         
	       //System.out.printf("%.2f", (double)fp);
	         System.out.printf("%.5f", fp);
	         System.out.printf("%.5f", (double)(sumn/arr.length));
	         System.out.printf("%.5f", (double)(sumz/arr.length));
	      // System.out.println("the fraction of postive number is"+ fp);
	       //System.out.println("the fraction of negative number is"+ (sumn/arr.length)); 
	       //System.out.println("the fraction of zero number is"+ (sumz/arr.length));
	 }
        
}
