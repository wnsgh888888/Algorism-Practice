package Practice;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String exit = "";

		try {
			do {
				System.out.println("A를 입력하시오. ");
				int a = sc.nextInt();

				System.out.println("B를 입력하시오. ");
				int b = sc.nextInt();

				System.out.println("연산을 입력하시오. ");
				String sign = sc.next();

				if (sign.equals("+"))
					System.out.println("답은" + (a + b));
				else if (sign.equals("*"))
					System.out.println("답은" + (a * b));
				else if (sign.equals("-"))
					System.out.println("답은" + (a - b));
				else if (sign.equals("/"))
					System.out.println("답은" + (a / b));
				
				System.out.println("그만하고 싶으면 exit을 입력하세요.");
				exit = sc.next();
				
			} while (!exit.equals("exit"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
