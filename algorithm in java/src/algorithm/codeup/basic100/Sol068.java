package algorithm.codeup.basic100;

import java.util.Scanner;
public class Sol068 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		
		if(a>=90) {
			System.out.println("A");
		}else if(a<90 && a>=70) {
			System.out.println("B");
		}else if(a<70 && a>=40) {
			System.out.println("C");
		}else
			System.out.println("D");
	
	
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