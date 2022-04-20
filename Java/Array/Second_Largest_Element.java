//TC = O(n)
//this will find the second largest element without sorting


class Solution {
    public static void main(String[]args) {

        int arr[] = {10, 1, 3, 2, 1};

        int max1=Integer.MIN_VALUE,max2=max1;

        for (int i=0;i<arr.length;i++){
            if (max1<arr[i]){
                max2=max1;
                max1=arr[i];
            }
            if(max1>arr[i] && max2<arr[i]){
                max2 = arr[i];
            }
        }
        System.out.println(max1+"\n"+max2);
    }
}
