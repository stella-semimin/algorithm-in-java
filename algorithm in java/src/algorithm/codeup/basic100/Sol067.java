package algorithm.codeup.basic100;

import java.util.Scanner;
public class Sol067 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		if(a>0) {
			System.out.println("plus");
			if(a%2==0) {
				System.out.println("even");
			}else if(a%2!=0)
				System.out.println("odd");
		}else if(a<0) {
			System.out.println("minus");
			if(a%2==0) {
				System.out.println("even");
			}else
				System.out.println("odd");	
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