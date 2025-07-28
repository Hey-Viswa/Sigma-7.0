package basic;

public class Dequeue {
    public static void main(String[] args) {
        java.util.Deque<Integer> deque = new java.util.ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        System.out.println("Deque: " + deque);
        deque.removeFirst();
        System.out.println("After removeFirst: " + deque);
    }
}
