package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol025 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int a =scanner.nextInt();
		
		int b10000 = Math.floorDiv(a,10000)*10000;
		int b1000 = Math.floorDiv(a-b10000,1000)*1000;
		int b100 = Math.floorDiv(a-b10000-b1000,100)*100;
		int b10 = Math.floorDiv(a-b10000-b1000-b100,10)*10;
		int b1 = Math.floorMod(a-b10000-b1000-b100-b10, 10);
		System.out.println("["+b10000+"]");
		System.out.println("["+b1000+"]");
		System.out.println("["+b100+"]");
		System.out.println("["+b10+"]");
		System.out.println("["+b1+"]");
	
		
		scanner.close();
	}
}

// %d (10���� ����)
// %s (���ڿ� ����)
// %f (�Ǽ��� ����)
// Locale ����
// %t (��¥�ð� ����)
// %c (�����ڵ� ���� ����)
// %o, %x(8����, 16���� ����)

// scanner.next().split(���� ����);

