package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol095 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int min = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			min = arr[0];
		}

		for (int i = 1; i < n; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}
		}
		System.out.println(min);

	}
}

//%d (10���� ����)
//%s (���ڿ� ����)
//%f (�Ǽ��� ����)
//Locale ����
//%t (��¥�ð� ����)
//%c (�����ڵ� ���� ����)
//%o, %x(8����, 16���� ����)

//scanner.next().split(���� ����);