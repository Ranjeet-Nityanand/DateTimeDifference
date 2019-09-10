/**
 * 
 */
package com.core;

import java.util.Scanner;

/**
 * @author Ranjeet
 *
 */
public class NumberSystem {

	static int c=0;
		public void decimalToBinary() {
		StringBuffer b= new StringBuffer();
		int n,r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter decimal Number");
		n=sc.nextInt();
		while(n>0) {
			r=n%2;
			b.append(r);			
			n=n/2;
		}
		System.out.println("binary Number"+b.reverse());
		}
		
		public void decimalToOctal() {
			StringBuffer sb=new StringBuffer();
			int n,r;
			Scanner sc=new Scanner(System.in);
			System.out.println("Entere Decimal Number");
			n=sc.nextInt();
			while(n>0) {
				r=n%8;
				sb.append(r);
				n=n/8;
			}
			System.out.println("Octal Number is->"+sb.reverse());
		}
		
		public void decimalToHexa() {
			StringBuffer sb=new StringBuffer();
			int n,r;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Decimal Number");
			n=sc.nextInt();
			while(n>0) {
				r=n%16;
				switch(r) {
				case 10:
				sb.append("A");	
				break;
				case 11:
				sb.append("B");
				break;
				case 12:
					sb.append("C");
				break;
				case 13:
					sb.append("D");
				break;
				case 14:
					sb.append("E");
				break;
				case 15:
					sb.append("F");
				default:
				sb.append(r);
				n=n/16;
				}
			}
			System.out.println("Hexa Number is ->"+sb.reverse());
		}
		
		public void binaryToDecimal() {
			int n,r,d=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Binary Number");
			n=sc.nextInt();
			while(n>0) {
				r=n%10;
				d+=r*(int)Math.pow(8, c);
				c++;
				n=n/10;
			}
			System.out.println("Decimal Value is-> "+d);
		}
		
		public void thirdHeigest() {
			int[] ar= {1,5,3,12,67,3,45,4};
			int num=3,index=0,c=0;
			int max=Integer.MIN_VALUE;
			int i;
			while(num>0) {
				max=Integer.MIN_VALUE;
				for(i=0;i<ar.length-1;i++) {
					if(ar[i]>max) {
						max=ar[i];
						index=i;
					}
				}
				ar[index]=Integer.MIN_VALUE;
				num--;
			}
			System.out.println(max);
		}
		
		/**
		 * @param args
		 */
		public static void main(String[] args) {
		 NumberSystem num=new NumberSystem();
//		 num.decimalToBinary();
//		 num.decimalToOctal();
//		 num.decimalToHexa();
//		 num.binaryToDecimal();
		 num.thirdHeigest();
		}
}
