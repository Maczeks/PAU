package zadanie1;

import java.util.Random;

public class HeapSort implements strategySort {
    static void heapify(int[] array, int length, int i) {
        int leftChild = 2*i+1;
        int rightChild = 2*i+2;
        int largest = i;

        if (leftChild < length && array[leftChild] > array[largest]) {
            largest = leftChild;
        }
        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array, length, largest);
        }
    }

    public static void heapSort(int[] array) {
        if (array.length == 0) return;
        int length = array.length;
        for (int i = length / 2-1; i >= 0; i--)
            heapify(array, length, i);

        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
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
        System.out.println("HeapSort: ");
        int begin=0;
        int end= array.length-1;
        randomData(array);
        long tStart = System.currentTimeMillis();
        heapSort(array);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        //printArray(array);
        System.out.println("Oczekiwana: " + elapsedSeconds);

        pesimisticData(array);
        tStart = System.currentTimeMillis();
        heapSort(array);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesymistyczny: " + elapsedSeconds);

        optimisticData(array);
        tStart = System.currentTimeMillis();
        heapSort(array);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optymistyczny: " + elapsedSeconds);

        System.out.println();
        System.out.println();
    }

}
