package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol087 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = scan.nextInt();
		//System.out.println("n----"+n);
		for (int i = 1;; i++) {
			//System.out.println("i----"+i);
			sum += i;
			//System.out.println("sum----"+sum);
			if (sum >= n) {
				
				break;
			}
			
		}System.out.println(sum);
		
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