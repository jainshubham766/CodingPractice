
class PrintingNumbers{

    public static void func(int n){
        if (n==0) return;
        func(n-1);
        System.out.println(n);
    }

    public static void funcReverse(int n){
        if (n==0) return;
        if (n!=0) {
            System.out.println(n);
            func(n - 1);
        }
    }


    public static void main(String[]args) {


        funcReverse(5);
        System.out.println("---------------------------");
        func(5);
    }
}