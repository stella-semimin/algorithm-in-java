package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol045 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long a = scanner.nextLong();
		Long b = scanner.nextLong();
		
		double c = (double)a/b;
		double d = (double)a/b;
		System.out.printf("%d%n",a+b);
		System.out.printf("%d%n",a-b);
		System.out.printf("%d%n",a*b);
		System.out.printf("%.0f%n",c);
		System.out.printf("%d%n",a%b);
		System.out.printf("%.2f%n",d);
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
