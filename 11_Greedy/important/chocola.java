import java.util.Collections;

public class chocola {

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());


        int h = 0, v = 0;
        int hp = 0,  vp = 0;

        while (h < costHor.length && v < costVer.length) {
            // vertical cost < hor cost 
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                h++;
                hp++;
            }   else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h<costHor.length) {
            cost += (costVer[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            vp ++;
            v++;
        
        }
        System.out.println();
    }
}
