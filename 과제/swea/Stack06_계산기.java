package 과제.swea;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Stack06_계산기 {

	public static void main(String[] args) {

		// 원래 같았으면 입력을 받을거야
		String infix = "(6+5*(2-8)/2)";
		
		// 연산자 우선순위
		// 괄호 ( : 우선순위 0
		// +, - : 우선순위 1
		// *, / : 우선순위 2
		Map<Character, Integer> priority = new HashMap<>();
		priority.put('(', 0);
		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);

		StringBuilder postfix = new StringBuilder();	// 후위 표기법을 저장할 변수
		
		// 연산자 & 괄호 받을 수 있는 스택
		Stack<Character> op = new Stack<>();			
		
		for(int i=0; i<infix.length(); i++) {
			// '('
			if(infix.charAt(i)=='(') {
				// 우선순위 0이라 무조건 스택에 추가하기
				op.push(infix.charAt(i));
			}
			
			// ')'
			else if(infix.charAt(i)==')') {
				while(op.peek() != '(') {
					postfix.append(op.pop());
				} op.pop();	// 여는 괄호 (는 결과에 추가하지 않고 스택에서 버리기
			}
			
			//피연산자 (한 자리라고 가정)
			else if(infix.charAt(i)>='0' && infix.charAt(i)<='9') {
				postfix.append(infix.charAt(i));		// 숫자는 그대로 후위 표기법에 추가
			}
			
			// 연산자
			else {
				// 공백
				if(op.isEmpty()) {
					op.push(infix.charAt(i));
				}
				
				// 공백 X
				else {
					// 연산자 우선 순위 비교해서 처리할 것
					//if(infix.charAt(i)=='*' && infix.charAt(i=='/'))
					while(priority.get(op.peek())>= priority.get(infix.charAt(i)) &&  !op.isEmpty()) {
						postfix.append(op.pop());
					}
					op.push(infix.charAt(i));
					
				}
			}
		}
		
		
		while(!op.isEmpty()) {	// 맨 처음과 맨 뒤에 괄호 없어도 답이 잘 나오도록 이 반복문 적어줌
			postfix.append(op.pop());
		}
		
		System.out.println(postfix);
		
		/////////////////////////////계산/////////////////////////////////////
		
		Stack<Integer> calc = new Stack<>();
		
		for(int i=0; i<postfix.length(); i++) {
			// 피연산자라면
			if(postfix.charAt(i) >= '0' && postfix.charAt(i) <= '9') {
				calc.push(postfix.charAt(i)  - '0');
			}else {
				// 꺼내는 순서 중요
				int B =calc.pop();
				int A = calc.pop();
				
				switch(postfix.charAt(i)) {
				case '+' : 
					calc.push(A+B);
					break;
				case '-' : 
					calc.push(A-B);
					break;
				case '*' : 
					calc.push(A*B);
					break;
				case '/' : 
					calc.push(A/B);
					break;
				}
			}
				
			System.out.println(calc.pop());
		}
		
		
	}

}
