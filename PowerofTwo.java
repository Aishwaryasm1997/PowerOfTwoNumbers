package day_5_assignments;

import java.util.Scanner;

public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();

		System.out.println("Powers of Two upto " + num);

		for (int i = 1; i <= num; i++) {
			System.out.println(i + " " + (Math.pow(2, i)));
		}
	}

}
