package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol078 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int i =0;
		int a = scanner.nextInt();
		for(i=0; i<=a; i++ ) {
			if(i%2==0) {
				sum = sum+ i;
			}
			
		}
		System.out.println(sum);
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