import java.util.*;
class MinStack {
//用两个栈来实现
    //s1栈正常插入，s2始终放的是s1栈的最小元素
    //每次插入s1时和s2中的栈顶元素比较，将小的一个插入s2栈

    public MinStack() {

    }
    Stack s1 = new Stack<>();
    Stack s2 = new Stack<>();
    public void push(int x) {
        s1.push(x);
        if(s2.isEmpty()){
            s2.push(x);
        }
        else{
            int min = (int)s2.peek();
            if(x < min){
                min = x;
            }
            s2.push(min);
        }

    }
    public void pop() {
        if(s1.isEmpty()){
            throw new RuntimeException("栈为空");
        }
        s1.pop();
        s2.pop();
    }

    public int top() {
        return (int)s1.peek();
    }

    public int getMin() {
        return (int)s2.peek();
    }
}
