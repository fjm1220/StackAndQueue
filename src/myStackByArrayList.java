public class myStackByArrayList {
    //不考虑扩容
    int[] array = new int[100];
    int size = 0; //当前栈中的元素个数
    //入栈
    public void push(int val){
        //判断栈是否为满
        if(size == array.length)
        {
            throw new RuntimeException("栈为满");
        }
        else{
            array[size++] = val;
        }
    }
    //出栈
    public int pop(){
        if(size == 0){
            throw new RuntimeException("栈为空");
        }
        else{
            return array[--size];
        }
    }
    //栈顶元素
    public int peek(){
        if(size == 0){
            throw new RuntimeException("栈为空");
        }
        else{
            return array[size-1];
        }
    }
    //判断栈是否为空
    public boolean isEmpty(){
        return size == 0;
    }
    //栈中的元素个数
    public int size(){
        return size;
    }

}
