class Node{
    int val;
    Node next;
    public Node(int val)
    {
      this.val = val;
    }
}
//从链表的尾端插入元素，从链表的头进行删除元素
public class myQueueByLinkedList {
    private Node head = null;
    private Node tail = null;
    int size = 0;
    //入队列
    public void offer(int val)
    {
        //队列中无元素时
        Node node = new Node(val);
        if(tail == null){
        head = node;
        }
        else{
            tail.next = node;
        }
        tail = node;
        size++;
    }
    //出队列
    public int pop(){
        if(size == 0){
            throw new RuntimeException("队列为空");
        }
        int ret = head.val;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return ret;
    }
    //队首元素
    public int peek(){
        if(size == 0){
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }
    //队列是否为空
    public boolean isEmpyt(){
        return size == 0;
    }
    //队列中的元素个数
    public int size(){
        return size;
    }
}

