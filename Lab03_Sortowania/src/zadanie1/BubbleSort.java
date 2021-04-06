package zadanie1;

import java.util.Random;

public class BubbleSort implements strategySort  {
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
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
        int j= array.length;
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
        System.out.println("BubbleSort: ");
        randomData(array);
        long tStart = System.currentTimeMillis();
        bubbleSort(array);
        long tEnd = System.currentTimeMillis();
        long tDelta = tEnd - tStart;
        double elapsedSeconds = tDelta / 1000.0;
        //printArray(array);
        System.out.println("Oczekiwana: " + elapsedSeconds);

        pesimisticData(array);
        //printArray(array);
        tStart = System.currentTimeMillis();
        bubbleSort(array);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Pesymistyczny: " + elapsedSeconds);

        optimisticData(array);
        tStart = System.currentTimeMillis();
        bubbleSort(array);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;
        System.out.println("Optymistyczny: " + elapsedSeconds);
        System.out.println();
        System.out.println();
    }
}
