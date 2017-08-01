import java.util.Scanner;

public class Algorithm_8958 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int testCase = Integer.parseInt(line);
		int score, cnt;
		
		while (testCase > 0) {
			String test = scanner.nextLine();
			score = 0;
			cnt = 0;
			
			for (int i = 0; i < test.length(); i++) {
				if (test.charAt(i) == 'O') {
					cnt++;
				}else{
					cnt = 0;
				}
				score += cnt;
			}
			
			System.out.println(score);
			testCase--;
		}
	}
}