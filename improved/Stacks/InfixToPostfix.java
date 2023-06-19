/*
	Given string A denoting an infix expression. Convert the infix expression into a postfix expression.

	String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English alphabets are operands and ^, /, *, +, - are operators.

	Find and return the postfix expression of A.

NOTE:

	^ has the highest precedence.
	/ and * have equal precedence but greater than + and -.
	+ and - have equal precedence and lowest precedence among given operators.
	
  //	Input 1 :  A = "x^y/(a*z)+b"  , Output 1 : "xy^az*/b+"
  // 	Input 2 : A = "a+b*(c^d-e)^(f+g*h)-i" , Output 1 : "abcd^e-fgh*+^*+i-"
	
*/

public class Solution{
		public String solve(String A){
			Stack<String> expr = new Stack();
			Stack<Character>op = new Stack();
			
			for(int i=0;i<A.length();i++){
				char ch = A.charAt(i);
				if(ch>='a' && ch<='z'){
					expr.push(ch+"");
				}else if(ch == '('){
					op.push(ch);
				}else if(ch == ')'){
					// closing bracket
					// resolve the expression iterate till open bracket 
					while(op.peek()!='('){
						String val2 = expr.pop();
						String val1 = expr.pop();
						char opr = op.pop();
						expr.push(val1+val2+opr);
					}
					// pop closing bracket 
					op.pop();
				}else{
					// operators 
					if(op.size()==0 || op.peek()=='('){
						op.push(ch); // add operators if op is empty or if we encounter open bracket '('
					}else{
						// loop and resolve based on priority 
						while(op.size()>0 && priority(ch)<= priority(op.peek())){
							String val2 = expr.pop();
							String val1 = expr.pop();
							char opr = op.pop();
							expr.push(val1+val2+opr);
						}
						op.push(ch); // push the operator 
					}
				}
			}
			
			while(op.size()>0){ // resolve remaining operators till op length 
				String val2 = expr.pop();
				String val1 = expr.pop();
				char opr = op.pop();
				expr.push(val1+val2+opr);
			}
			
		    return expr.peek();
		}
		public int priority(char ch){
				if(ch == '^'){
						return 3;
				}else if(ch == '*' || ch == '/'){
						return 2;
                }else if(ch == '+' || ch == '-'){
						return 1;
                }else {
						return -1;
                }					
		}
}


