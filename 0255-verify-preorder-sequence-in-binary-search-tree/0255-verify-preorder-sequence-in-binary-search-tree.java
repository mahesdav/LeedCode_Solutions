class Solution {
    public boolean verifyPreorder(int[] preorder) {

        // to solve this problem, we'll use stack
        // stack will have all the elements smaller than already added element in stack
        // in this, whenever we get any element from array, we push that in stack
        // but, before pushing that, we check if the current element is greater than top of the stack, pop it so that we get its parent element
        // for preorder, Root-left-right, we must satisfy one condition i.e.
        // current element < val (val is the popped element from stack)

        int val = Integer.MIN_VALUE;

        Stack<Integer> stack = new Stack();

        for(int i : preorder){
            if(i < val){
                // preorder condition failed
                // i < val means, current element is not processed on left side
                return false;
            }
            // iterate stack to get parent of current element
            while(!stack.isEmpty() && i > stack.peek()){
                val = stack.pop();
            }   

            stack.push(i);
        }
        return true;
    }
}