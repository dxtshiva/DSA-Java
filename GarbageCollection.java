import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class demo{
    int obj1;
    int obj2;

    public demo(int a, int b){
        this.obj1 = a;
        this.obj2 = b;
        System.out.println("Memory allocated to object successfully");
    }
    public void getValue(){
        System.out.println("The values of a and b are: "+obj1+", "+obj2);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Memory of object deallocated successfully");
    }
}
public class GarbageCollection {
       
    public static void main(String[] args) {
        demo obj1 = new demo(10, 2);
        obj1.getValue();

        try{
            obj1=null;
            System.gc();
            obj1.getValue();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<50;i++)
            list.add(i);
        
        for(int i=0;i<20;i++)
            System.out.print(list.get(i)+" ");
            System.out.println();
        try{
            list = null;
            System.gc();
            System.out.println(list.get(3));
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        Stack<String> stack = new Stack<>();
        for(char c= 'a';c<='z';c++)
            stack.push(c+"");
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("The current top element in stack is: "+stack.peek());
        try{
            stack = null;
            System.gc();
            System.out.println(stack.peek());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        System.gc();
    }
}
