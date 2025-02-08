package DSA.Array_one;

public class BinarySearchQuestion {
    public static void main(String[] args) {
     int arr[] = {2,2,3,4,4,4,6,8,9};
     int arr2[] = {4,4,8,8,8,15,16,23,23,42,50};
//     binarySearch(arr,4,true);
//     binarySearch(arr,4,false);

        int first = binarySearOccurrence(arr2,15,true);
        int last = binarySearOccurrence(arr2,15,false);
        if(first == -1){
            System.out.println("Occurrence of target is : "+0);
        } else{
            System.out.println("Occurrence of target is : "+ (last - first +1));

        }
    }

    static void binarySearch(int arr[] ,int target,boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                ans = mid;
                if(isFirst){
                    end = mid -1;
                }else {
                  start = mid+1;
                }
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

    static int binarySearOccurrence(int arr[] ,int target,boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]== target){
                ans = mid;
                if(isFirst){
                    end = mid -1;
                }else {
                    start = mid+1;
                }
            }else if(arr[mid]<target){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;
    }
}
