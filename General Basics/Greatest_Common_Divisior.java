
//This method is to find greatest common divisior
class GCD{

    public static void main(String[]args) {

        int m=35,n=11;

        while (m!=n &&( m>0&&n>0)){
            if(m>n) m=m-n;
            else if (n>m) n=n-m;
        }

        if (n==m) System.out.println("HCF is : "+m);
        else System.out.println("HCF doesn't exist");

    }

}

