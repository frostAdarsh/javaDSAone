package DSA.Array_one;

public class LinearSearch {
    public static void main(String[] args) {
//       int arr[] = {2,2,3,4,1,7,2,9};
//       linearSearch(arr,2,false);
//       linearSearch(arr,2,true);
//       linearSearchMultiple(arr,2);
//        findMax(arr)
//        findMin is same as findMax
        int arr2d[][]={
                {2,4,1,5,1},
                {6,7,3,4,2},
                {8,1,2,2,3},
                {5,5,5,8,4}
        };

//        linearSearch2b(arr2d,4,false);
        findMaximumSumSubarray(arr2d);
    }
    public  static  void linearSearch(int arr[],int target, boolean findLast){
        int ans = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                ans = i;
                if(findLast==false){
                    break;
                }
            }
        }
        if(ans == -1){
            System.out.println("Element is not present in the array");
        }else {
            System.out.println("Found element at pos "+ ans);
        }

    }

    public  static  void linearSearchMultiple(int arr[],int target) {
        int ans[] = new int[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans[k] = i;
                k++;

            }
        }
        if (k == 0) {
            System.out.println("Element is not present in the array");
        } else {
            for(int i = 0; i < k; i++) {
                System.out.println("Found element at pos " + ans[i]);
            }
        }
    }

    public  static  void findMax(int arr[]){

//        int max = arr[0];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximun element is " + max);
    }

    public  static  void linearSearch2b(int arr[][], int target, boolean findLast){

        int outerIndex= -1;
        int InnerIndex = -1;
        for(int i=0;i<arr.length;i++){
            boolean found = false;
            for (int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    outerIndex = i;
                    InnerIndex = j;
                    if(findLast == false){
                        found = true;
                        break;
                    }
                }
            }
            if(found == true){
               break;
            }
        }
        if(outerIndex == -1){
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Found element at pos "+ outerIndex+","+ InnerIndex);
        }
    }

    public  static  void  findMaximumSumSubarray(int arr[][]){
     int max = Integer.MIN_VALUE;
     int resIndex = -1;
     for(int i =0;i<arr.length;i++){
         int sum =0;
         for(int j=0;j<arr[i].length;j++){
             sum = sum + arr[i][j];
         }
         if(sum>max){
             max = sum;
             resIndex = i;
         }
     }
     System.out.println("Maximum sum subarray is : "+ max + ", for the index "+ resIndex);
    }
}
