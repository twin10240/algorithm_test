import java.util.Scanner;

public class Algorithm_2490 {
	public static void main(String[] args) {
		// 배(0), 등(1)
		// 도 - A, 개 - B, 걸 - C, 윳 - D, 모 - E
		Scanner scanner = new Scanner(System.in);
		
		// 3번의 패 만들기
		int[][] items = new int[3][4];
		
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length; j++) {
				items[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < items.length; i++) {
			int zeroCount = 0;
			
			for (int j = 0; j < items[i].length; j++) {
				if (items[i][j] == 0) {
					zeroCount++;
				}
			}
			
			switch (zeroCount) {
			case 0:
				System.out.println("E");
				break;
			case 1:
				System.out.println("A");
				break;
			case 2:
				System.out.println("B");
				break;
			case 3:
				System.out.println("C");
				break;
			case 4:
				System.out.println("D");
				break;	
			}
		}
		
	}
}
