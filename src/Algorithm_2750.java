import java.util.Scanner;

public class Algorithm_2750 {
	public static void main(String[] args) {
		/**  수 정렬하기 알고리즘  **/
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int[] array = new int[count];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		for (int i = 0; i <= array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		for (int i : array) {
			System.out.println(i);
		}
	}
}
