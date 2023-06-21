class Solution {
    Stack<Integer> minStack = new Stack();
    Stack<Integer> valStack = new Stack();
    public void push(int x) {
        // update val stack 
        if(valStack.size()==0){
            valStack.push(x);
            minStack.push(x);
            return;
        }
        valStack.push(x);
        // handle min stack
        Integer min = minStack.peek();
        if(x<=min){
            minStack.push(x);
        }
    }

    public void pop() {
        if(valStack.size()!=0){
            int temp = valStack.pop();
            if(temp == minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top() {
        if(valStack.size()!=0){
            return valStack.peek();
        }else{
            return -1;
        }
    }

    public int getMin() {
        if(minStack.size()!=0){
            return minStack.peek();
        }else{
            return -1;
        }
    }
}
