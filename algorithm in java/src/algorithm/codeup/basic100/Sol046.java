package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol046 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long a = scanner.nextLong();
		Long b = scanner.nextLong();
		Long c = scanner.nextLong();
		
		double result = (double)(a+b+c)/3;

		System.out.println(a+b+c);
		System.out.printf("%.1f%n",result);
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
