import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Demo
{
  public static void main(String args[])throws IOException
  {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter: ");
		int a = Integer.parseInt(br.readLine());
		System.out.println(a);
  }
}