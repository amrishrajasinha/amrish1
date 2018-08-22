package Package1;

import java.util.Scanner;

public class TableRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int n, i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for print the table :");
		n = sc.nextInt();
		Table(n,i);
	}
	public static int Table (int a, int b) {
		if (b==11) {
			return b;
		}else {
			System.out.println(a + "*" +b +"=" +(a*b));
		}
		return Table(a, b+1);	
		
	}
}

