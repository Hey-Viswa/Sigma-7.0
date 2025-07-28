import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val [] = {60,100,120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));
        int cxapacity = W;
        int finalval = 0;
        for (int i = 0; i >= 0; i++) {
            int idx = (int)ratio[i][0];
            if (cxapacity>= weight[idx]) {
                finalval += val[idx];
                cxapacity -= weight[idx];
            } else {
                finalval += (ratio[i][1] * cxapacity);
                cxapacity = 0;
                break;
            }
        }
        System.out.println("final value = " + finalval);
    }
}
