package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol026 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		String arr[] = time.split(":");
		String a = arr[1];
		int b = Integer.parseInt(a);
		
		System.out.println(b);
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

