package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol083 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		while(i<=n) {
			if(i%3 ==0) {
				System.out.print("X ");
			}else if(i%3 !=0) {
				System.out.print(i+" ");
			}
			i++;				
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