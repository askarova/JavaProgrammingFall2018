package day23_loops06;

import java.util.Scanner;

public class WarmUpTask1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter phone number:");

		String phoneNumber = input.next();
		String areaCode = "";
		// (202)3334444 or 2023334444
		if (phoneNumber.startsWith("(")) {
			areaCode = phoneNumber.substring(1, 4);
		} else {
			areaCode = phoneNumber.substring(0, 3);
		}
		System.out.println(areaCode);

		String state;

		switch (areaCode) {

		case "202":
			state = "Washington DC";
			break;
		case "703":
			state = "Virginia";
			break;
		case "209":
			state = "California";
			break;
		case "312":
			state = "Illinois";
			break;
		case "347":
			state = "New York";
			break;
		default:
			state = "Not in database";

		}

		System.out.println(state);

	}

}

