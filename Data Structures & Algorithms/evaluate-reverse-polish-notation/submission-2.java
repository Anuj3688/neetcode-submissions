class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack  = new ArrayDeque<>();

        int ans = 1;
        int i = 0;
        while ( i < tokens.length){
            if (isOperand(tokens[i])){
                int ele2 = stack.pop();
                int ele1 = stack.pop();
                switch(tokens[i]){
                    case "+": ans = ele1+ele2; break;
                    case "*": ans = ele1*ele2; break;
                    case "-": ans = ele1-ele2; break;
                    case "/": ans = ele1/ele2; break;
                }
                 stack.push(ans);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            i++;

        }

        return stack.pop();
    }
        public boolean isOperand(String c){
        return c.equals("-") || c.equals("*")|| c.equals("/")|| c.equals("+");
    }
}
