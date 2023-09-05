package Program;

import java.security.DrbgParameters.NextBytes;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AccountException;

public class app {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data: ");
		try {
			System.out.print("Enter number account: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter holder: ");
			String holder = sc.nextLine();
			System.out.print("Balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Whitdraw limit: ");
			Double whithdrawLimit = sc.nextDouble();
			
			Account ac = new Account(number, holder, balance, whithdrawLimit);
			
			System.out.println("Enter whitdraw: ");
			Double whitdraw = sc.nextDouble();
			ac.whitDraw(whitdraw);
			System.out.println("new balance: " + ac.toString());
			}
		
			catch(InputMismatchException e){
				System.out.println("ERR: era esperado um numero!");				
			}
		
			catch (AccountException e) {
				System.out.println("ERR!!: " + e.getMessage());
			}
			catch (RuntimeException err) {
				System.out.println("Unexpected error");				
			}
		

	}

}
