import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        //first in first out (interface)
        //classes of queue - priorityQueue and LinkedList
        String[] data={"to","be","or","not","the","be"};
        Queue<String> queue=new LinkedList<>();
        for(String str:data){
            queue.add(str);
        }

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

    }
}
