package algorithm.codeup.basic100;

import java.util.Scanner;
public class Sol070 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		switch(a) {
		case 12:
		case 1:
		case 2:	
			System.out.println("winter");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("spring");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("summer");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("fall");
			break;

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