import java.util.PriorityQueue;

public class ConnectNRopesWithMinCost {
    // given are N ropes of different length, the task is to connect these ropes int one rope with minimum cost, such that the cost to connect two ropes is equal to the sum of their lengths.
    static int minCost(int arr[], int n){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            p.add(arr[i]);
        }
        int res = 0;
        while (pq.size() > 1) {
            int first = q.poll();
            int second = q.poll();
            res += first + second;
            p.add(first + second);
        }
        return res;
    }
    public static void main(String[] args) {
        int len[] = {4,3,2,6};
    }
}
