package ri.mirea.pr5;
import java.math.BigInteger;

public class Ex4 {
    public boolean Simple(int x){
        BigInteger bigInteger = BigInteger.valueOf(x);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(x));
        return probablePrime;
    }
}
