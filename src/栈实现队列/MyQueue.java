package 栈实现队列;
import java.util.*;
class MyQueue {
    //两个栈实现队列
    public MyQueue() {

    }
    //入队列的栈
    Stack<Integer> s1 = new Stack<>();
    //出队列的栈
    Stack<Integer> s2 = new Stack<>();
    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if(s1.isEmpty() && s2.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        if(!s2.isEmpty()){
        return s2.pop();
        }
        //
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public int peek() {
        if(s1.isEmpty() && s2.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        if(!s2.isEmpty()){
            return s2.peek();
        }
        //
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.peek();
    }

    public boolean empty() {
    return s1.isEmpty() && s2.isEmpty();
    }
}

