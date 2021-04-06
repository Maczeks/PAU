package zadanie1;

import java.util.Random;

public class QuickSort implements strategySort  {
    public static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
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
        System.out.println("QuickSort: ");
        int begin=0;
        int end= array.length-1;
        randomData(array);
        long tStart = System.currentTimeMillis();
        quickSort(array,begin,end);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        //printArray(array);
        System.out.println("Oczekiwana: " + elapsedSeconds);

        pesimisticData(array);
        tStart = System.currentTimeMillis();
        quickSort(array,begin,end);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesymistyczny: " + elapsedSeconds);

        optimisticData(array);
        tStart = System.currentTimeMillis();
        quickSort(array,begin,end);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optymistyczny: " + elapsedSeconds);

        System.out.println();
        System.out.println();
    }
}
