package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol019 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner�� date �Է¹ޱ�
		String date = scanner.next();
		String dateAry[] = date.split("\\.");
		
		int yy = Integer.parseInt(dateAry[0]);
		int mm = Integer.parseInt(dateAry[1]);
		int dd = Integer.parseInt(dateAry[2]);
		
		
		
		System.out.printf("%04d.%02d.%02d",yy,mm,dd);
		scanner.close();
	
	}

}

// %d (10���� ����)
// %s (���ڿ� ����)
// %f (�Ǽ��� ����)
// Locale ����
// %t (��¥�ð� ����)
// %c (�����ڵ� ���� ����)
// %o, %x(8����, 16���� ����)

// scanner.next().split(���� ����);

