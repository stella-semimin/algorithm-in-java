package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol092 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int day=1;
		while(day%a!=0|| day%b!=0|| day%c!=0) {
			day++;
			//break;
		}
			System.out.println(day);
		
	
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