package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol027 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b[] = a.split("[.]");
		System.out.printf("%2s-%2s-%s",b[2],b[1],b[0]);
	
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

