package algorithm.codeup.basic100;

import java.util.Scanner;
public class Sol069 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		scanner.close();
		
		switch(a) {
		case "A":
			System.out.println("best!!!");
			break;
		case "B":
			System.out.println("good!!");
			break;
		case "C":
			System.out.println("run!");
			break;
		case "D":
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
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