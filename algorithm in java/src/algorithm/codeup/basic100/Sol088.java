package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol088 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i = 1;
		for (i = 1;i<=n; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
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