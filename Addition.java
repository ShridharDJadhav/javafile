import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter First No.: ");
		int a =sc.nextInt();
		System.out.println("Enter second No.: ");
		int b =sc.nextInt();
		
		System.out.println("Addition is " + (a+b));
	}

}
