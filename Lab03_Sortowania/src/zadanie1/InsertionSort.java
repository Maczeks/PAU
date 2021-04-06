package zadanie1;

import java.util.Random;

public class InsertionSort implements strategySort  {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
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
        System.out.println("InsertionSort: ");
        randomData(array);
        long tStart = System.currentTimeMillis();
        insertionSort(array);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        //printArray(array);
        System.out.println("Oczekiwana: " + elapsedSeconds);

        pesimisticData(array);
        tStart = System.currentTimeMillis();
        insertionSort(array);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesymistyczny: " + elapsedSeconds);

        optimisticData(array);
        tStart = System.currentTimeMillis();
        insertionSort(array);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optymistyczny: " + elapsedSeconds);

        System.out.println();
        System.out.println();
    }
}
