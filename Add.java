import java.util.Scanner;
class Add
	{
		public static void main(String args[])
			{
				int myname,secondnumber,add;
				Scanner myobj = new Scanner(System.in);
				System.out.println("Enter  numberr : ");
				myname = myobj.nextInt();
				System.out.println("Enter  number : ");
				secondnumber = myobj.nextInt();	
				add=myname+secondnumber;
				System.out.println("The sum of two number is : "+add);	
						
			}
	}
