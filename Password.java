import java.util.scanner;
public class Password
{
public static void main( String [] args)
{

	int PW;
	Scanner sc = new Scanner (System.in);
	
	for(int i = 1; i <= 100; i++ )
	{
		System.out.print("Enter your password:");
		PW = sc.nextInt();

			if(PW == 1234)
			{
				System.out.println("you have entered correct password");
				break;
			}
			System.out.println("your password is wrong");
			
		
	}
}
}