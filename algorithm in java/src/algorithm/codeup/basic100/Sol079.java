package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol079 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			char a = scanner.next().charAt(0);
			if(a=='q') {
				System.out.println(a);
				break;
			}
			System.out.println(a);
			
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