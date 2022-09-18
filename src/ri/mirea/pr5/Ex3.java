package ri.mirea.pr5;

public class Ex3 {
    public int Count(int x){
        if(x / 10 >= 1) {
            int tempvar =x % 10;
            int remain=x / 10;
            return tempvar + Count(remain);
        }
        else {
            return x;
        }
    }
}
