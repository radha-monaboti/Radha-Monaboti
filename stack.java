 class Stack
{
    int top;
    int capacity;
    int arr[];
    public Stack(int capacity)
    {
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }
    boolean isFull()
    {
        return top==capacity-1;
    }
    boolean isEmpty()
    {
        return top==-1;
    }
    void push(int item)
    {
    if(isFull())
    {
        System.out.println("stack overflow");
        return ;
    }
    top++;
    arr[top]=item;
    System.out.println(item+"pushed");
    }
    int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack underflow:");
            return -1;
        }
        return arr[top--];
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        else
        {
            System.out.println("the peek of the stack is:");
            return arr[top];
        }
    }
    void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack is:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
        System.out.print(" ");
    }
}
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack s=new Stack(10);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(34);
        s.push(32);
        s.display();
        System.out.println("element is popped:"+ s.pop());
        System.out.printf("top element is :"+s.peek());
        s.push(15);
        s.push(25);
        s.display();
    }
}