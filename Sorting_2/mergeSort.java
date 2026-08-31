import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        int[] a = { 1, 21, 4, 12, 5, 80, 61, 84, 65,77 };
        mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

    }

    public static void mergeSort(int[] arr, int low, int high) {
        int n = arr.length;
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;

        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}