import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //elements are stored and accessed in (last in first out manner) - LIFO.
        //that is elements are added to the top of the stack and removed from the top of the stack
        //push and pop element in stack

        String[] data={"to","be","or","not","the","be"};
        Stack<String> stack=new Stack<>();
        for(String str:data){
            stack.push(str);
        }
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());//value at top of stack without removing

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack);
    }
}
