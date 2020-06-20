package 队列实现栈;

import java.util.*;
//两个队列实现栈
//q2为辅助队列
public class myStack2 {
    public myStack2() {

    }
    Queue q1 = new LinkedList<>();
    Queue q2 = new LinkedList<>();
    public void push(int x) {
        q1.offer(x);
    }

    public int pop() {
        if(q1.isEmpty() && q2.isEmpty())
        {
            throw new RuntimeException("栈为空");
        }
        //如果队列中有大于1个元素，就将q1中的元素搬移到q2中
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int n = (int)q1.poll();
        //交换q1和q2，让q2始终未辅助队列
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return n;
    }

    public int top() {
        if(q1.isEmpty() && q2.isEmpty())
        {
            throw new RuntimeException("队列为空");
        }
        //如果队列中有大于1个元素，就将q1中的元素搬移到q2中
        while(q1.size() > 1){
            q2.offer(q1.poll());
        }
        int n = (int)q1.poll();
        q2.offer(n);
        //交换q1和q2，让q2始终未辅助队列
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return n;
    }

    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}


