/**
 * 
 */
package com.core;

import java.util.Scanner;

/**
 * @author Ranjeet
 *
 */
public class TestProgram {


	public void armstrongNumber() {
		int c = 0, reminder, num, originalInput, value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		sc.close();

		num = number;
		originalInput = number;
		while (number > 0) {
			c++;
			number = number / 10;
		}

		while (num > 0) {
			reminder = num % 10;
			value = (int) (value + (Math.pow(reminder, c)));
			num = num / 10;
		}
		if (value == originalInput) {
			System.err.println("Armstrong Number=>" + value);
		} else
			System.err.println("Not Armstrong Number=>" + value);

	}

	public void armstrongBtGivenRange() {
		int count, firstNumber, secondNumber, originalNumber, processNumber1, processNumber2, reminder, value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Start Range");
		firstNumber = sc.nextInt();
		System.out.println("Enter Ending Range");
		secondNumber = sc.nextInt();
		sc.close();
		for (int i = firstNumber; i <= secondNumber; i++) {
			processNumber1 = processNumber2 = originalNumber = i;
			count = 0;
			while (processNumber1 > 0) {
				count++;
				processNumber1 = processNumber1 / 10;
			}
			value = 0;
			while (processNumber2 > 0) {
				reminder = processNumber2 % 10;
				value = (int) (value + (Math.pow(reminder, count)));
				processNumber2 = processNumber2 / 10;
			}
			if (value == originalNumber) {
				System.err.print(" " + value);
			}
		}
	}

	public void checkPrime() throws Exception {
		int number, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");

		number = sc.nextInt();
		sc.close();
		for (i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				System.out.println(number + "Is Not Prime");
				break;
			}
		}
		if (i > number / 2) {
			System.out.println(number + "Is Prime Number");
		}
	}

	public void primeInRange() {
		int i, j;
		for (i = 1; i <= 100; i++) {
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (j > i / 2) {
				System.out.print(i + " ");
			}
		}
	}

	public void checkPelindrome() {
		int number, value, originalNumber, reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		number = sc.nextInt();
		sc.close();
		originalNumber = number;
		value = 0;
		while (number > 0) {
			reminder = number % 10;
			value = (value * 10) + reminder;
			number = number / 10;
		}
		if (value == originalNumber) {
			System.out.println(value + "  Is Palindrome");
		} else
			System.out.println(value + "   Is Not Palindrome");
	}

	public void pelindromeInRange() {
		int i, originalNumber, processNumber, value, reminder;
		for (i = 1; i <= 10000; i++) {
			processNumber = originalNumber = i;
			value = 0;
			while (processNumber > 0) {
				reminder = processNumber % 10;
				value = (value * 10) + reminder;
				processNumber = processNumber / 10;
			}
			if (value == originalNumber) {
				System.out.print(" " + value);
			}
		}
	}

	public void checkNeon() {
		int square, number, reminder, nn;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		number = sc.nextInt();
		sc.close();
		square = number * number;
		nn = 0;
		while (square > 0) {
			reminder = square % 10;
			nn = nn + reminder;
			square = square / 10;
		}
		if (nn == number) {
			System.out.println(nn + "  Is Neone Number");
		} else
			System.out.println(nn + "   Is Not Neone");
	}

	public void neonInRange() {
		int i, reminder, square, nn;
		for (i = 0; i <= 1000; i++) {
			square = i * i;
			nn = 0;
			while (square > 0) {
				reminder = square % 10;
				nn = nn + reminder;
				square = square / 10;
			}
			if (i == nn) {
				System.out.println(" " + nn);
			}

		}
	}

	public void fibonacci() {
		int i = 0, j = 1, k, f;
		f = i + j;
		for (k = 1; k <= 18; k++) {
			System.out.print(i + " ");
			i = j;
			j = f;
			f = i + j;

		}
	}

	public void stringPalindrome() {
		String text, reverse = "";
		char[] ch = new char[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		text=sc.nextLine();
		sc.close();
		ch = text.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			reverse += ch[i];
		}
		if (reverse.equalsIgnoreCase(text))
			System.out.println(reverse + "  palindrome");
		else
			System.out.println(reverse + "  not Palindrome");
	}

	public void stringPalindrome2() {
		String text, reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Text for Palindrome test");
		text=sc.nextLine();
		sc.close();
		for(int i=text.length()-1;i>=0;i--) {
			reverse += text.charAt(i);
		}
		if (reverse.equals(text)) {
			System.out.println(text + " is Palindrome");
		} else
			System.err.println(text + " is Not Palindrome");
	}

	public void arrayUnique() {
		String sArray = "";
		int[] array = { 0, 1, 3, 6, 6, 7, 7, 8, 8, 8, 9 };
		int n, i, j;
		n = array.length;
		for (i = 0; i < n - 1; i++) {
			boolean b = true;
			for (j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					b = false;
				}
			}
			if (b) {
				sArray += String.valueOf(array[i] + " ");
			}
		}
		sArray += array[i];
		System.out.print("String Value" + sArray);
		String[] ar = sArray.split("");
		for (String l : ar)
			System.out.print(l);
	}

	public void arrayS()
	{
			int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
		int n = arr.length;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n;) {
					if (arr[i] == arr[j]) {
						for (int k = j; k < n - 1; k++) {
							arr[k] = arr[k + 1];
						}
						n--;
					} else
						j++;
				}

			}
		System.out.println("Correct array");
		for (int l = 0; l < n; l++)
		{
			System.out.println(arr[l]);
			}
	}

	public void maxAndMinNumber() {
		int[] arr = { 8, 3, 5, 1, 16, 3, 6, 7, 9, 100, 3, 9 };
		int size, i, max, min;
		size = arr.length;
		min = max = arr[0];
		for (i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("maximum number is->" + max + "  min Number is=>" + min);
	}

	public void maxAndSecondMax() {
		int[] arr = { 30000, 300, 400, 6, 2234 };
		int max, secondMax, i, size;
		size = arr.length;
		secondMax = max = Integer.MIN_VALUE;
		for (i = 0; i < size; i++) {
			if (arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			if (arr[i] > secondMax && arr[i] != max) {
				secondMax = arr[i];
			}

		}
		if (secondMax == Integer.MIN_VALUE) {
			System.err.println("There is no second Minimum number in this Array");
		}
		else
		System.err.println("maximum Number is->" + max + "  Second Maximum is->" + secondMax);
	}

	public void threeLargest() {
		int[] arr = { 6, 10, 60, 0, 1, -34, -456, 4343 };

		// first method

		int max = Integer.MIN_VALUE;
		int x = 4;
		int index = 0;
		while (x > 0) {
			max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
					index = i;
				}
			}
			arr[index] = Integer.MIN_VALUE;
			x--;
		}
		System.err.println(max);

		// Second M

		// int first, second, third, i, size;
		// size = arr.length;
		// first = second = third = Integer.MIN_VALUE;
		// for (i = 0; i < size; i++) {
		// if (arr[i] > first) {
		// third = second;
		// second = first;
		// first = arr[i];
		// }
		// if (arr[i] > second && arr[i] != first) {
		// third = second;
		// second = arr[i];
		// }
		// if ((arr[i] > third) && (arr[i] != second && arr[i] != first)) {
		// third = arr[i];
		// }
		// }
		// if (second == Integer.MIN_VALUE || third == Integer.MIN_VALUE)
		// System.err.println("This Array does not contain correct value");
		// else
		// System.out.printf("first second and Third Largest Value=" + first + " " +
		// second + " " + third);
	}

	public void searchingArray() {
		int[] arr = { 3, 5, 3, 2, 6, 334, 23, 64, 75 };
		int searchValue, i;
		System.out.println("Enter Search Number");
		Scanner sc = new Scanner(System.in);
		searchValue = sc.nextInt();
		sc.close();
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == searchValue) {
				System.out.println(searchValue + "  Number found");
				break;
			}

		}
		if (i >= arr.length)
			System.out.println(searchValue + "   Number Not Found");
	}

	public void binarySearch() {
		int[] arr = { 1, 3, 6, 9, 10, 12, 13, 15, 16, 20, 36, 39 };
		int searchValue, i, mid, size;
		size = arr.length;
		mid = size / 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Value:");
		searchValue = sc.nextInt();
		sc.close();
		if (searchValue <= arr[mid]) {
			for (i = 0; i <= mid; i++) {
				if (arr[i] == searchValue) {
					System.out.println(searchValue + "   Found");
					break;
				}
			}
			if (i > mid)
				System.err.println(searchValue + "  Not Found");
		} else if (searchValue > arr[mid]) {
			for (i = mid; i < size; i++) {
				if (arr[i] == searchValue) {
					System.out.println(searchValue + "   Found");
					break;
				}
			}
			if (i >= size)
				System.err.println(searchValue + "  Not Found");
		}
	}

	public void selectionSort() {
		int[] arr = { 3, 6, 1, 76, 3, 232, 56, 123 };
		int i, j, temp, size;
		size = arr.length;
		for (i = 0; i < size - 1; i++) {
			for (j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int k : arr) {
			System.out.print(" " + k);
		}
	}

	public void bubbleSort() {
		int[] arr = { 3, 64, 2, 1, 0, 3, 66, 234, 12, 6, 42 };
		int i, j, temp, size;
		size = arr.length;
		for (i = 0; i < size - 1; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	public void matrixPrint() {
		int[][] a = new int[3][3];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value");
		for (i = 0; i <= 2; i++) {
			for (j = 0; j <= 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		// simple print
		for (i = 0; i <= 2; i++) {
			for (j = 0; j <= 2; j++) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		// clock wise movement
		for (i = 0; i <= 2; i++) {
			for (j = 2; j >= 0; j--) {
				System.out.print(" " + a[j][i]);
			}
			System.out.println();

		}
		System.out.println();
		// chtt ptt movement
		for (i = 0; i <= 2; i++) {
			for (j = 2; j >= 0; j--) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();

		}
		System.out.println();
		for (i = 2; i >= 0; i--) {
			for (j = 2; j >= 0; j--) {
				System.out.print(" " + a[i][j]);
			}
			System.out.println();

		}
	}
	public static void main(String[] args) throws Exception {
		TestProgram test = new TestProgram();
		try {
			test.matrixPrint();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
