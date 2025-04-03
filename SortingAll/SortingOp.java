import java.util.Arrays;

public class SortingOp {
    public static void main(String[] args) {
        int[] arr = {7000,8000,9000,6000};
        int n = arr.length;

        System.out.println("Array before sorting:" + Arrays.toString(arr));


        MainOperations.InsertionSort(arr, n);



        System.out.println("Array After sorting:" + Arrays.toString(arr));
    }
}

class MainOperations {

    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void BubbleSort(int[] arr, int n) {

        for(int i=0;i<n-1;i++) { // Number of Passes
            for(int j=0;j<n-1;j++) { // Iterations in each pass
                if(arr[j] > arr[j+1]) {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void SelectionSort(int[] arr, int n) {

        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[i]) {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void InsertionSort(int[] arr, int n) {

        for(int i=1;i<n;i++) {
            int j=i;
            while(j>0 && (arr[j-1] > arr[j])) {
                swap(arr, j-1,j);
                j--;
            }
        }
    }

    public static void MergeSort(int[] arr) {
        int n = arr.length;

        if(n<2) {
            return;
        }

        int mid = n / 2;

        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[n-mid];

        for(int i=0;i<mid;i++) {
            leftHalf[i] = arr[i];
        }

        for(int i=mid;i<n;i++) {
            rightHalf[i-mid] = arr[i];
        }

        MergeSort(leftHalf);
        MergeSort(rightHalf);

        merge(arr, leftHalf, rightHalf);
    }

    public static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int i=0, j=0, k=0;
        int leftn = leftHalf.length;
        int rightn = rightHalf.length;

        while(i < leftn && j < rightn) {
             if(leftHalf[i] <= rightHalf[j]) {
                 arr[k] = leftHalf[i];
                 i++;
             } else {
                 arr[k] = rightHalf[j];
                 j++;
             }
             k++;
        }

        while(i<leftn) {
            arr[k] = leftHalf[i];
            i++;
            k++;
        }

        while(j<rightn) {
            arr[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void QuickSort(int[] arr, int begin, int end) {
        if(begin < end) {
            int partitionIndex = partition(arr, begin, end);

            QuickSort(arr, begin, partitionIndex-1);
            QuickSort(arr, partitionIndex+1, end);
        }
    }

    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for(int j=begin;j<end;j++) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);

        return i+1;
    }


}





