package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol041 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0);
		scanner.close();
		
		int num = (int)a;
		int ascNum = num+1;
		char asc = (char)ascNum;
		
		System.out.printf("%c",asc);

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
