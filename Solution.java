public class Solution {
    public static boolean isPrime(int x) {
        if(x <= 1) return false;
        for(int i = 2; i < x; i++) {
            if(x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Solution.isPrime(2)); //-> true
        System.out.println(Solution.isPrime(0)); //-> false
        System.out.println(Solution.isPrime(1)); //-> false
        System.out.println(Solution.isPrime(31)); //-> true
        System.out.println(Solution.isPrime(22)); //-> false
        System.out.println(Solution.isPrime(13)); //-> true
    }
}