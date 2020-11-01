import java.util.*;

public class SieveOfEratothenes
{
	public static void main(String[] args) {
		int n = 100;
        boolean isPrime[] = sieveOfEratosthenes(n);
        for(int i=0;i<=n;i++){
            if(isPrime[i]){
                System.out.print(i+" ");
            }
        }
		
    }
    

    static boolean[] sieveOfEratosthenes(int n){

        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2;i * i <= n; i++){
            for(int j = 2*i; j<=n; j += i){
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

}
