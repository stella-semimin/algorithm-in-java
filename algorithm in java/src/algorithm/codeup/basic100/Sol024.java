package algorithm.codeup.basic100;

import java.util.Scanner;

public class Sol024 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		String st =scanner.next();
		String[] arr = new String[20];
		for(int i=0; i< st.length(); i++) {
			arr[i] = st.substring(i,i+1);
			if(i<st.length()-1) {
				System.out.print("'"+arr[i]+"'\n");	
			}else
				System.out.println("'"+arr[i]+"'");
		}	
		
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

