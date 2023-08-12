package com.manoj;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {

		try {
			String name = JOptionPane.showInputDialog("Enter Date of Birth[DD/MM/YYYY]");
			String dobString = dob(name);
			String arr[] = dobString.split("/");
			int d = Integer.parseInt(arr[0]);
			int m = Integer.parseInt(arr[1]);
			int y = Integer.parseInt(arr[2]);
			var d1 = LocalDate.of(y, m, d);
			var d2 = LocalDate.now();
			var d3 = Period.between(d1, d2);
			JOptionPane.showMessageDialog(null, "Your age is: " + d3.getYears() + " years, " + d3.getMonths()
					+ " months, " + d3.getDays() + " days.");
			JOptionPane.showMessageDialog(null, "Developed by Manoj Jejurkar");
			System.out.println("code run successfully");
		} catch (Exception e) {

			System.out.println(e.getMessage());

			System.out.println("wrong input");
			// TODO: handle exception
		}
	}

	private static String dob(String name) {
		// TODO Auto-generated method stub
		return name;
	}
}
