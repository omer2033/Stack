public class Stack<T> {
    private int maxSize;
    private Object[] stackArray;
    private int top;

    MyStack(int size){
        this.maxSize = size;
        stackArray = new Object[size];
        this.top = -1;

    }
    public static void main(String[] args){
        MyStack<Integer> newStack = new MyStack<>(5);
        newStack.push(5);
        newStack.push(1);newStack.push(3);
        newStack.display();
        newStack.peek();

    }
    public void push(Object newItem){
        if (isFull()){
            System.out.println("Stack is full");
            return;
        }
        top = top+1;
        stackArray[top] = newItem;
        System.out.println("Added item: "+newItem);
    }
    public boolean isFull(){
        return (top == maxSize-1);

    }
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        T item = (T) stackArray[top];
        stackArray[top]= null;
        top = top-1;
        System.out.println("Popped item : "+item);

    }
    public void peek(){
        if(stackArray.length == 0){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Peek : "+stackArray[top]);;
        }
    }

    public boolean isEmpty(){
        return(top==-1);
    }
    public void display(){
        if (isEmpty()==true){
            System.out.println("Stack is empty.");
        }else{
            for(int i =0 ; i<stackArray.length; i++){
                System.out.println(stackArray[i]);
            }
        }
    }

}