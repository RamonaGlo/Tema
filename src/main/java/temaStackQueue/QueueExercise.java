package temaStackQueue;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExercise {

    public static Queue<Integer> queueSorter(Queue<Integer> q) {

        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();

        while (!q.isEmpty())
            q1.add(q.remove());

        while (!q1.isEmpty()) {
            int next = q1.remove();
//            System.out.println(next + " " + q2);

            while (!q2.isEmpty() && next < q2.peek())
                if (next < q2.peek()) {
                    q1.add(q2.remove());
                }
            q2.add(next);
        }
        return q2;
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQ= new PriorityQueue<Integer>();

        priorityQ.add(1);
        priorityQ.add(2);
        priorityQ.add(-2);
        priorityQ.add(9);
        priorityQ.add(4);
        priorityQ.add(-5);
        priorityQ.add(8);
        priorityQ.add(-8);
        priorityQ.add(-12);
        priorityQ.add(15);
        priorityQ.add(23);

      System.out.println("Sorted queue " + queueSorter(priorityQ));
    }
}