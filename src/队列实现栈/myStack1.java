package 队列实现栈;



import java.util.*;
//一个队列实现栈
class MyStack{
    int size = 0;
    public MyStack() {

    }
    Queue<Integer> q = new LinkedList<>();
    public void push(int x) {
        q.offer(x);
        size++;
    }

    public int pop() {
        if(q == null){
            throw new RuntimeException("队列为空");
        }
        for(int i = 0;i < size-1;i++){
            int t = q.poll();
            q.add(t);
        }
        size--;
        return q.poll();
    }

    public int top() {
        if(q == null){
            throw new RuntimeException("栈为空");
        }
        for(int i = 0;i < size-1;i++){
            int t = q.poll();
            q.add(t);
        }
        size--;
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
