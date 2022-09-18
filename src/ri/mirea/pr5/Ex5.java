package ri.mirea.pr5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex5 {
    public String CreateMassive(int x){
        List<Integer> al = new ArrayList<Integer>();
        //since you wanted 1 in the res adn every no will be divided by 1;
        al.add(1);

        for(int i = 2; i < x; i++) {
            while(x % i == 0) {
                al.add(i);
                x = x / i;
            }
        }
        if(x > 2) {
            al.add(x);
        }

        int[] res = new int[al.size()];
        for(int i = 0; i < al.size(); i++)
            res[i] = al.get(i);

        String str = Arrays.toString(res);

        return str;
    }
}
