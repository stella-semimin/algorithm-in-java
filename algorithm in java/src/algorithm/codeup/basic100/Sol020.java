package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol020 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// scanner�� �ֹε�Ϲ�ȣ �Է¹ޱ�
		String jumin = scanner.next();
		String Array[] = jumin.split("\\-");
		
		String a =Array[0];
		String b =Array[1];
		
	
		System.out.printf("%s%s",a,b);
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

