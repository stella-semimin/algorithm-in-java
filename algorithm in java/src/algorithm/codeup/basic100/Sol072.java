package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol072 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		//System.out.println(count);
		int a[] = new int[count];
		for(int i=0; i<count; i++) {
			a[i] = scanner.nextInt();
		}
		for(int i=0; i<count; i++) {
			System.out.println(a[i]);
		}
			
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