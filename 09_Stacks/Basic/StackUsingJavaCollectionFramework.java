import java.util.*;;
public class StackUsingJavaCollectionFramework {
    public static void main(String[] args) {
        // stack s = new Stack();
        Stack<Integer> si = new Stack<>();
        si.push(1);
        si.push(2);
        si.push(3);

        while (!si.isEmpty()) {
            System.out.println(si.peek());
            si.pop();
        }
    }
}
