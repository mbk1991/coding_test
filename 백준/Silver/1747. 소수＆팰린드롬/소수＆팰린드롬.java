import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean[] isPrimeArr = eratosPrimeFilter();

        for(int i=N; i<isPrimeArr.length; i++){
            if(isPrimeArr[i] && isPalindrome(i)){
                System.out.println(i);
                break;
            }
        }
    }

    static boolean[] eratosPrimeFilter(){
        boolean[] isPrimeArr = new boolean[2_000_000 + 1];
        for(int i=2; i<isPrimeArr.length; i++){
            isPrimeArr[i] = true;       //init
        }
        for(int i=2; i<isPrimeArr.length; i++){
            if(isPrimeArr[i]){
                for(int j=i*2; j<isPrimeArr.length; j+=i){
                    isPrimeArr[j] = false; //no prime filtering
                }
            }
        }
        return isPrimeArr;
    }

    static boolean isPalindrome(int num){

        int n = num;

        int jarisu = 0;
        for(int i=1;;i*=10){
            if( n/i == 0 ){
                jarisu = (int)Math.log10(i) - 1;
                break;
            }
        }

        int reverseNum = 0;
        for(int i=jarisu,j=1; i>=0; i-=1){
            int p = (int)Math.pow(10,i);
            reverseNum += n / p * j;
            n %= p;
            j*=10;
        }

        return num==reverseNum;
    }

}
