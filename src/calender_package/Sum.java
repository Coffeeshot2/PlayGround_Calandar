package calender_package;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		
		//입력 : 키보드로 두 수의 입력을 받는다.
		
		int a, b; 
		
		//Scanner라는 클래스를 사용.		
				
		Scanner scanner = new Scanner(System.in);
		
		//입력 장치를 열었다 _ =다 쓰면 닫아줘야 한다

		//System.in : 키보드 입력

		String s1, s2;
		System.out.println("두 수를 입력해 주세요: ");
		s1 = scanner.next();
		s2 = scanner.next();
		
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
		//		System.out.println(a + ", " + b);

		//		System.out.println("두 수의 합은" + (a + b) + "입니다." );
		System.out.printf("%d와 %d의 합은 %d입니다",a, b, a + b);		
				
        //출력 : 화면에 두 수의 출력을 받는다.
		
		scanner.close();
		
		//		열었던 Scanner를 닫아준다. 
	}

}
