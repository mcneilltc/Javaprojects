
import java.util.Arrays;
import java.util.Random;

public class SortingArrays {

    public static void main(String[] args) {
rand();

    }//main
    public static void rand() {
        Integer [] myArray = new Integer[100];

        for (int i = 0; i < 100; i++) {
            int n = new Random().nextInt(100);
            myArray[i] = n;
            System.out.println(myArray[i]);// create the array that with random numbers
        }
        mergeSort(myArray);
        System.out.println("\n Sorted Numbers: ");
        System.out.println(Arrays.toString(myArray));

        }//rand()


public static Comparable[] mergeSort(Comparable[]list){
    if (list.length <= 1){//if the list is less than one, nothing will return
        return list;
    }
    Comparable[] first = new Comparable[list.length/2];//this creates the first list to compare numbers to be sorted to
    Comparable[] second = new Comparable[list.length - first.length];
    System.arraycopy(list, 0, first, 0, first.length);//creates a copy of the firs half of the array to be sorted
    System.arraycopy(list, first.length, second, 0, second.length);///creates a copy of the second half of the array to be sorted

    mergeSort(first);// first the the second are part of the recursion method for the sorting the
    mergeSort(second);// two halves of the arrays and then merges the two halves back together
    merge(first, second, list);
    return list;
}//mergeSort
private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        //each part of the array is then assigned an index number for starting.
    int iFirst = 0;//index for the 1 half
    int iSecond = 0;//index for the 2nd half
    int iMerged = 0;// index after the array has been merged
    while (iFirst < first.length && iSecond < second.length) {
        //this compares the first and second halves of the two halves array to the merged array
        if (first[iFirst].compareTo(second[iSecond]) < 0) {
            result[iMerged] = first[iFirst];
            iFirst++;
        } else {
            result[iMerged] = second[iSecond];
            iSecond++;
        }
        iMerged++;
    }
    System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);//copy of the sorted numbers in the first half of the array
    System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);// copy of the sorted numbers in the second half of the array
}//end merge

static int[] countingSort(int myArray[]){
    int b = myArray.length;
    int result[] = new int [b];
    int count[]= new int[100];
    for(int i=0; i <100; ++i)
        count[i]= 0;
    for(int i=0; i<b; ++i)
        ++count[myArray[i]];
    for(int i =0; i<=100; ++i)
        count[i] += count[i-1];
    for(int i = 0; i<b; ++i){
        result[count[myArray[i]]-1]= myArray[i];
        --count[myArray[i]];
    }
    return result;
}


public static class quicksort {
    public static void quickSort(int[] myArray) {
        quickSort(myArray, 0, myArray.length - 1);//the array is being sorted based on the length, to include all numbers that can be sorted
    }

    public static void quickSort(int[] myArray, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = myArray[(left + right) / 2];// creates the pivot for all the numbers to be compared to while being sorted
        int index = partition(myArray, left, right, pivot);//the partition is created to know which side numbers will move based on the pivot number
        quickSort(myArray, left, index - 1);// numbers being sorted on the left of the pivot
        quickSort(myArray, index, right);// numbers being sorted on the right of the pivot
    }

    private static int partition(int[] myArray, int left, int right, int pivot) {
        //this partition goes through the numbers and compares them to one another and places them on the left or the right side of the pivot number
        while (left <= right) {
            while (myArray[left] < pivot) {
                left++;
            }
            while (myArray[right] > pivot) {
                right--;
            }
            if (left <= right) {// when the numbers are sorted, the array is also sorted on the basis of being compared to the pivot
                swap(myArray, left, right);
                left++;
                right--;
            }

            return left;
        }
    }
}//quick sort class
}//class sorting arrays