import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Demo
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Name:");
		String a=br.readLine();
		System.out.println(a);
		System.out.println("Enter Your Roll No.:");
		String b=br.readLine();
		System.out.println(b);
		System.out.println("Enter Your Address:");
		String c=br.readLine();
		System.out.println(c);
		System.out.println("Enter Your Marks:");
		String d=br.readLine();
		System.out.println(d);
	}
}