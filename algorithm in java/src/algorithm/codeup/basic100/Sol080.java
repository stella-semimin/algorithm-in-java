package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol080 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum =0;
		int i = 0;
		while(sum < num) {
			i++;
			sum += i;
		}
		System.out.println(i);
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