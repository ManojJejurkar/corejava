import java.util.Scanner;

public class DoWhileloop {

	public static void main(String[] args) {

		boolean con = true;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("*******Number Program*********");
			System.out.println(" 1.Factorial of number \n 2. Prime Number \n 3. Odd Even Number \n 4. Exit");
			System.out.println("Please enter your choice:   ");
			int ch = scanner.nextInt();

			System.out.println("Please Enter Number:  ");
			int n = scanner.nextInt();
			switch (ch) {
			case 1: // Factorial
				int m = 1;
				for (int i = 1; i <= n; i++)
					m = m * 1;
				System.out.println("Factorial:  " + m);
				break;

			case 2: // Prime
				boolean flag = true;
				for (int i = 2; i < n; i++) {
					if (n % i == 0) {
						flag = false;
						break;
					}
					if (flag) {
						System.out.println("Prime Number");
					} else
						System.out.println("Not Prime number");
					break;
				}
			case 3: {// odd even
				if (n % 2 == 0)
					System.out.println("Even");
				else
					System.out.println("Odd");
				break;
			}	

			case 4: // Exit
				con = false;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + ch);
			}
		} while (con);
	}
}
