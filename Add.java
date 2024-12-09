import java.util.Scanner;
class Add
	{
		public static void main(String args[])
			{
				int myname,secondnumber,add;
				Scanner myobj = new Scanner(System.in);
				System.out.println("Enter 1 number : ");
				myname = myobj.nextInt();
				System.out.println("Enter 2 number : ");
				secondnumber = myobj.nextInt();	
				add=myname+secondnumber;
				System.out.println("The sum of two number is : "+add);	
						
			}
	}