package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol018 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time[] = scanner.next().split(":");
		System.out.println(time[0]+":"+time[1]);
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

