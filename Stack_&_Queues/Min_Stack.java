/*
push
1. if stack is empty set min to integer.max
2. else check the pushed ele with min and set min
3. push ele and min
pop
1. if empty return -1;
2. pop the min
3. next pop is element to be popped
4. set min as top
5. return res
min
1. if empty return -1
2. else return top
*/   
int minEle;
    Stack<Integer> s = new Stack<Integer>();

    /*returns min element from stack*/
    int getMin()
    {
        if(s.empty()) return -1;
        else
        return s.peek();
	// Your code here
    }
    
    /*returns poped element from stack*/
    int pop()
    {
        if(s.empty()) return -1;
        s.pop();
        int res = s.peek();
        s.pop();
        if(!s.empty()) {
            minEle = s.peek();
        }
        return res;
	// Your code here	
    }

    /*push element x into the stack*/
    void push(int x)
    {
        if(s.empty()) minEle = Integer.MAX_VALUE;
        if(x < minEle)
        minEle = x;
        s.push(x);
        s.push(minEle);
	// Your code here	
    }	