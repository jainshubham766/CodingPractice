
class PrimeNumber{

    static int i=2;

    public static boolean isPrime(int n){
        if (n<=1) return false;
        if (n==i) return true;

        if (n%i==0) return false;
        i++;
        return isPrime(n);
    }


    public static void main(String[]args) {
        //    Using Recursion   tc= O(n)
        System.out.println("The number is Prime--> "+isPrime(11));
        // another approach can be the fun with for loop till _/n (square root )

    }

}
