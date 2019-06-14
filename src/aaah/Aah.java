package aaah;

import java.util.Scanner;

public class Aah {
	private Scanner sc = new Scanner(System.in);

	private boolean go() {
		String person = sc.next();
		String doctor = sc.next();

		return doctor.length() <= person.length();
	}

	private void run() {
		if (go()) {
			System.out.print("go");
		} else {
			System.out.print("no");
		}
	}

	public static void main(String[] a) {
		(new Aah()).run();
	}
}
