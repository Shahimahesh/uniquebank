package UsaBank;

import java.util.Scanner;

public class UsaBankAtm {

	public static void main(String[] args) {
		
		String[] name = { "Bimala", "Pratima", "Bharat", "Alex", "Sita" };
		String[] email = { "bimalashahi@gmail.com", "pratimashahi@gmail.com", "bharatshahi@gmial.com",
				"alexshahi@gmail.com", "sitashahi@gmail.com" };
		int[] accno = { 1010, 1111, 1212, 1313, 1414 };
		int[] atmno = { 1515, 1616, 1717, 1818, 1919 };
		int[] pin = { 1234, 2345, 3456, 4567, 5678 };
		int[] ssn = { 2001, 2002, 2003, 2004, 2005, 2006 };
		int[] driverln = { 6666, 7777, 8888, 9999, 1010 };
		int[] balance = { 100, 200, 300, 400, 500 };
		String[] address = { "Kathmandu", "Biratnagar", "Lamki", "Tikapur", "Bhaktapur" };

		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to usa bank");
		System.out.println("thanks for business with us");

		System.out.println("please enter your cardno");
		int atm = sc.nextInt();
		UsaBank ub = new UsaBank();
		boolean flag = ub.verifyuser(atmno, atm);
		if (flag == true) {
			System.out.println("please enter your pin");
			int pin1 = sc.nextInt();
			boolean pinverify = ub.verifypin(pin, pin1, atmno, atm);
			if (pinverify = true) {
				String name1 = ub.findnameindex(name, atmno, atm);
				System.out.println("welcome" + "" + name1);
				System.out.println("please enter 1 for withdraw and 2 for deposit and 3 for balance enquiry ");

				int input = sc.nextInt();
				{
					if (input == 1) {
						System.out.println("enter withdrawing amount");
						int withdraw = sc.nextInt();
						int currbalance = ub.findbalance(balance, atmno, atm);
						if (withdraw > currbalance) {
							System.out.println("insufficient balance");
						} else {
							System.out.println("please collect your money");
							System.out.println("your new balance is" + "" + (currbalance - withdraw));
						}

					} else if (input == 2) {
						System.out.println("enter diposit amount");
						int deposit = sc.nextInt();
						int currbalance = ub.findbalance(balance, atmno, atm);
						System.out.println("your new balance is" + "" + (currbalance + deposit));

					} else if (input == 3) {
						int currbalance = ub.findbalance(balance, atmno, atm);
						System.out.println("your balance is" + "" + currbalance);

					} else {
						System.out.println("invalid input");
					}
				}
			} else {

				System.out.println("wrong password");

			}

		} else {
			System.out.println("Back again main menu");
		}
	}



	}


