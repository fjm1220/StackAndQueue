package 循环队列;

class MyCircularQueue {
    int[] array = new int[100];
    int head = 0;
     //tail表示队列中最后一个元素的下一个下标
    //有效元素为[head,tail)
    int tail = 0;
    //size为数组中元素个数
    int size = 0;
    public MyCircularQueue(int k) {

    }

    public boolean enQueue(int value) {
        if(size == array.length){
            return false;
        }
        array[tail] = value;
        tail++;
        //注意：当数组放满时tail = 0；
        if(tail == array.length){
            tail = 0;
        }
        size++;
        return true;
    }

    public boolean deQueue() {
        if(size == 0){
            return false;
        }
        head++;
        //注意：当head到达数组末尾时head=0
        if(head == array.length){
            head = 0;
        }
        size--;
        return true;
    }

    public int Front() {
        if(size == 0){
            throw new RuntimeException("队列为空");
        }
        return array[head];
    }

    public int Rear() {
        if(size == 0){
            throw new RuntimeException("队列为空");
        }
        if(tail == 0){
            return array[array.length-1];
        }
        return array[tail-1];
    }

    public boolean isEmpty() {
       return size == 0;
    }

    public boolean isFull() {
        if(size == array.length){
            return true;
        }
        return false;
    }
}

