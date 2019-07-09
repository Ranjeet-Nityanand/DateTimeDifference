package com.core;

public class Pattern {
	public static void main(String[] args) {
		Pattern p = new Pattern();
		p.reverseTringle();
	}

	public void halfDiamond() {
		int i, j, s, k = 10;
		for (i = 1; i <= k; i++) {
			for (s = k; s > i; s--) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void fullDiamond() {
		int i, j, s, k = 10;
		for (i = 1; i <= k; i++) {
			for (s = k; s > i; s--) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = k; i >= 1; i--) {
			for (s = i; s < k; s++) {
				System.out.print(" ");
			}
			for (j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public void tringle() {
		int i, j, k = 5;
		for (i = 1; i <= k; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void reverseTringle() {
		int i, k = 10;
		for (i = 1; i <= k; i++) {
			for (int j = 1; j <= k; j++) {
				if (k - j >= i) {
				System.out.print(" ");
			}
			else {
					System.out.print("*");
			}
			}
			System.out.println();
		}
	}
}
