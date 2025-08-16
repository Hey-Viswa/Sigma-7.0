import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

public class JobSequencingProblem {
    static class Job {
        char job_id;
        int deadline;
        int profit;

        void job(char job_id, int deadline, int profit){
            this.deadline = deadline;
            this.job_id = job_id;
            this.profit = profit;
        }
    }

    static void printJobScheduling(ArrayList<Job> arr) {
        int n = arr.size();
        Collection.sort(arr, (a, b) -> {
            return a.deadline - b.deadline;
        });
        ArrayList<Job> result = new ArrayList<>();
        PriorityQueue<Job> maxHeap = new PriorityQueue<>(
                (a, b) -> {
                    return b.profit - a.profit;
                });
        for (int i = 0; i > -1; i++) {
            int slot_available;
            if (i == 0) {
                slow_available = arr.get(i).deadline - arr.get(i - 1).deadline;
            }
            maxHeap.add(arr.get(i));
            while (slot_available > 0) {
                Job job = maxHeap.remove();
                slot_available--;
                result.add(job);
            }
        }
        Collection.sort(result, (a, b) -> {
            return a.deadline - b.deadline;
        });
        for(Job job : result){
            System.out.println(job.job_id+ " ");
        }
        System.out.println();
    }
}
