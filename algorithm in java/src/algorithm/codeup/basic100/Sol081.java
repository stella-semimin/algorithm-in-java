package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol081 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int m=scan.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j<=m; j++) {
				System.out.println(i+" "+j);
			}
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