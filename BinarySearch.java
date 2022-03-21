public class BinarySearch {
    
    public static void main(String[] args) {
        int arr[] = {11 , 12 , 15 , 18 , 45 , 78};
        int s = 0;
        int e = arr.length-1;
        int target = 78;
        System.out.println("This program will find the index of target element");
        System.out.println("Target at index "+Search(arr, s, e, target));

    }
    public static int Search(int[] arr,int s,int e,int target) {
        if(s > e)
        return -1;
        int mid = (s + e)/2;
        if(arr[mid] == target)
        return mid;
        else if(target < arr[mid])
        return Search(arr, s, mid-1, target);
        else
        return Search(arr, mid+1, e, target);
    }
}
