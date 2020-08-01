package DataStructurePractice;

public class StackImp{
    int size;
    int arr[];
    int top;

    //time complexity: O[1]

    StackImp(int size){
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int element){
        if(!isFull()){
            top++;
            arr[top] = element;
            System.out.println("Pushed Element: "+ element);
        }else {
            System.out.println("Stack is full now");
        }
    }

    public int pop(){
        if(!isEmpty()){
            int returedTop = top;
            top--;
            System.out.println("Poped elememt: "+ arr[returedTop]);
            return arr[returedTop];
        }else{
            System.out.println("Stack is empty ");
            return -1;
        }
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (size-1 == top);
    }

    public int peek(){
        if(!this.isEmpty()){
            return arr[top];
        } else {
            System.out.println("Stack is empty: ");
            return -1;
        }
    }

    public static void main(String[] args) {
        StackImp stackImp = new StackImp(10);
        stackImp.pop();
        System.out.println("***************");
        stackImp.push(100);
        stackImp.push(200);
        stackImp.push(300);
        stackImp.push(400);
        System.out.println("***************");
        stackImp.pop();
        stackImp.pop();
        System.out.println("***************");
        System.out.println(stackImp.peek());
        System.out.println(stackImp.isEmpty());
        System.out.println(stackImp.isFull());

    }
}