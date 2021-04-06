package zadanie1;

import java.util.Random;

public class MergeSort implements strategySort  {
    public static void merge(int[] array, int left, int mid, int right) {

        int lengthLeft = mid - left + 1;
        int lengthRight = right - mid;

        int leftArray[] = new int [lengthLeft];
        int rightArray[] = new int [lengthRight];

        for (int i = 0; i < lengthLeft; i++)
            leftArray[i] = array[left+i];
        for (int i = 0; i < lengthRight; i++)
            rightArray[i] = array[mid+i+1];

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < lengthLeft && rightIndex < lengthRight) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;
                }
                else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            }
            else if (leftIndex < lengthLeft) {
                array[i] = leftArray[leftIndex];
                leftIndex++;
            }

            else if (rightIndex < lengthRight) {
                array[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (right <= left) return;
        int mid = (left+right)/2;
        mergeSort(array, left, mid);
        mergeSort(array, mid+1, right);
        merge(array, left, mid, right);
    }

    public static void randomData(int[] array){
        Random random = new Random();
        for(int i=0;i<array.length;i++) {
            int randomInt=random.nextInt(100);
            array[i]=randomInt;
        }
    }
    public static void pesimisticData(int[] array){
        int j=1000;
        for(int i=0;i<array.length;i++) {
            array[i]=j;
            j--;
        }
    }
    public static void optimisticData(int[] array) {
        for(int i=0;i<array.length;i++) {
            array[i]=i;
        }
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
    }

    @Override
    public void sort() {
        System.out.println("MergeSort: ");
        int left=0;
        int right= array.length-1;
        randomData(array);
        //printArray(array);
        long tStart = System.currentTimeMillis();
        mergeSort(array,left,right);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        //printArray(array);
        System.out.println("Oczekiwana: " + elapsedSeconds);

        pesimisticData(array);
        tStart = System.currentTimeMillis();
        mergeSort(array,left,right);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesymistyczny: " + elapsedSeconds);

        optimisticData(array);
        tStart = System.currentTimeMillis();
        mergeSort(array,left,right);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optymistyczny: " + elapsedSeconds);

        System.out.println();
        System.out.println();
    }
}
