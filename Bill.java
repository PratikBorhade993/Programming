import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
class calculatebill
 {
   static int bill(int units)
     {
		 int fix_amount=150;
       if(units<=100)
       {
        return fix_amount+units*3;
       }
      else if(units<=200)
       {
        return fix_amount+(100*3)+(units-100)*5;
       }
      else if(units<=300)
       { 
         return fix_amount+(100*3)+(100*5)+(units-200)*7;
       }
      else if(units>=300)
       {
         return fix_amount+(100*3)+(100*5)+(100*7)+(units-300)*10;
       }
       return 0;
     }
   public static void main(String args[]) throws IOException
    { 
     int units=Integer.parseInt(args[0]);
     System.out.println(bill(units));
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter Number of units:");
	 int a=sc.nextInt();
	  System.out.println(bill(a));
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number of units:");
		int b=Integer.parseInt(br.readLine());
		 System.out.println(bill(b));
	
    }       
}
