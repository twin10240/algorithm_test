import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Algorithm_1157 {
	public static void main(String[] args) {
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		String line = scanner.next();
		
		for (int i = 0; i < line.length(); i++) {
			int cnt = 1;
			
			if (wordMap.containsKey(String.valueOf(line.charAt(i)))) {
				wordMap.put(String.valueOf(line.charAt(i)), wordMap.get(String.valueOf(line.charAt(i))) + 1);
			}else {
				wordMap.put(String.valueOf(line.charAt(i)), cnt);
			}
		}

		List<Integer> sortLine = new ArrayList<Integer>();
        
		Iterator<String> it = wordMap.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sortLine.add(wordMap.get(key));
		}
        
		Collections.sort(sortLine);
        
		if (sortLine.get(sortLine.size() - 1) == sortLine.get(sortLine.size() - 2)) {
			System.out.println("?");
		}else{
			System.out.println(sortLine.get(sortLine.size() - 1));
		}
	}
}