package DSA.Array_one;

public class BinarySearch {
    public static void main(String[] args) {
      int arr[] = {2,5,7,11,45,87,90};
      int arr2[] = {90,87,54,36,22,1};
      binarySearch(arr,7);
      binarySearchDesc(arr2,36);
      binarySearchorderAgnosyic(arr2,54);
      binarySearchorderAgnosyic(arr,87);

    }
    static  void  binarySearchorderAgnosyic(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        if(arr[start]<=arr[end]){
            binarySearch(arr,target);
        }
        else {
            binarySearchDesc(arr,target);
        }
    }

    static void binarySearch(int arr[] ,int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
           int mid = start + (end-start)/2;
           if(arr[mid]== target){
               ans = mid;
               break;
           }else if(arr[mid]<target){
               start = mid+1;
           }else {
               end = mid-1;
           }
        }
        if(ans == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Found element "+ target + " at index : "+ ans);
        }
    }

    static void binarySearchDesc(int arr[] ,int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                ans = mid;
                break;
            }else if(arr[mid]<target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        if(ans == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Found element "+ target + " at index : "+ ans);
        }
    }
}
