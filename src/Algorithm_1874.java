

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Algorithm_1874 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		StackSu stack = new StackSu();
		
		List<Integer> arrPop = new ArrayList<Integer>();
		int state;
		
		for (int i = 0; i < count; i++) {
			int num = s.nextInt();
			
			while(true){
				if (num == stack.top()) {
					arrPop.add(stack.pop());
					System.out.println("-");
					break;
				}else{
					if (num > stack.top()) {
						state = -1;
						
						stack.push();
						if (arrPop.size() > 0) {
							for (int j = 0; j < arrPop.size(); j++) {
								if (arrPop.get(j) == stack.top()) {
									state = 1;
								}
							}
						}
						
						if (arrPop.size() == 0 || state != 1) {
							System.out.println("+");	
						}
					}else{
						state = -1;
						
						stack.pop();
						
						if (arrPop.size() > 0) {
							for (int j = 0; j < arrPop.size(); j++) {
								if (arrPop.get(j) == stack.top()) {
									state = 1;
								}
							}
						}
						
						if (arrPop.size() == 0 || state != 1) {
							System.out.println("-");
						}
					}
				}
			}
		}
	}
}

class StackSu{
	int top;
	List<Object> arrStack;
	
	public StackSu(){
		top = 0;
		arrStack = new ArrayList<Object>();
	}
	
	public void push(){
		arrStack.add(++top);
	}
	
	public int top() {
		return this.arrStack.size() > 0 ? (int) this.arrStack.get(arrStack.size() - 1) : -1;
	}
	
	public int pop() {
		int result = 0;
		
		if (this.arrStack.size() != 0) {
			result = (int) this.arrStack.get(arrStack.size() - 1);
			this.arrStack.remove(arrStack.size() - 1);
			top--;
		}else{
			result = -1;
		}
		
		return result;
	}
	
}
