package palindrome ;
import java.util.Scanner;
//This program checks whether a number is palindrome
public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
	System.out.println("This program checks whether a given number is palindrome ");
	while(true){
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        while (num != 0) {

            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;

        }

        if (original == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
	System.out.println("Do you want to continue (Y/N): ");
	char b=Character.toUpperCase(sc.next().charAt(0));
	if (b=='N') {
		System.out.println("Thank you ");
		break;
		}
		

	}
	sc.close();

    }
}
