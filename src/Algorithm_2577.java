

import java.util.*;

public class Algorithm_2577 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> splitMul = new HashMap<String, Integer>();
		
		int[] arrNum = new int[3];
		int mul = 1;
		
		for (int i = 0; i < arrNum.length; i++) {
			arrNum[i] = scanner.nextInt();
			mul *= arrNum[i];
		}

		String[] s_mul = Integer.toString(mul).split("");
		
		for (int i = 0; i < s_mul.length; i++) {
			int cnt = 0;

			if (splitMul.containsKey(s_mul[i])) {
				cnt = splitMul.get(s_mul[i]);
			}
			
			cnt++;
			
			switch (s_mul[i]) {
			case "0":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "1":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "2":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "3":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "4":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "5":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "6":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "7":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "8":
				splitMul.put(s_mul[i], cnt);
				break;
				
			case "9":
				splitMul.put(s_mul[i], cnt);
				break;
			}
		}
		
		for (int j = 0; j < 10; j++) {
			if (splitMul.containsKey(Integer.toString(j))) {
				System.out.println(j + " - " + splitMul.get(Integer.toString(j)));
			}else {
				System.out.println(j + " - " + "0");
			}
		}
	}
}