package com;

public class NumberLetterCounts {

	public static void main(String[] args) {
		int x = 342;
		int letters = countLetters(x);
		System.out.println(letters);

	}

	private static int countLetters(int number) {
		String numberinwords = "";
		int numat100=0,numat10=0,numat1=0;
		String[] ones = new String[] { "", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine" };
		String[] units10 = new String[] { "", "eleven", "twelve", "thirteen",
				"fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		String[] tens = new String[] { "", "ten", "twenty", "thirty", "forty",
				"fifty", "sixty", "seventy", "eighty", "ninety" };

		if (number == 1000) {
			numberinwords = "onethousand";
		} else {
			

			numat100 = number / 100;
			numat10 = (number / 10) % 10;
			numat1 = number % 10;

			if (numat100 > 0) {
			numberinwords += ones[numat100] + "hundred";
				if (numat10 != 0 || numat1 != 0)
					numberinwords += "and";
			}

			if (numat10 == 1) {
				if (numat1 == 0)
					numberinwords += tens[numat10];
				else
					numberinwords += units10[numat1];
			}
			else
				numberinwords += tens[numat10] + ones[numat1];
		}
		return numberinwords.length();

	}

}
