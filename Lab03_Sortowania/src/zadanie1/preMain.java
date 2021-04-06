package zadanie1;

import zadanie2.IfEqual;
import zadanie3.Missing;
import zadanie4.ReorderDigits;
import zadanie5.Kaprekar;
import zadanie6.MyException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class preMain {
    public static void zadanie1() {
        System.out.println("Zadanie 1: ");
        QuickSort quickSort = new QuickSort();
        BubbleSort bubbleSort = new BubbleSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();
        quickSort.sort();
        bubbleSort.sort();
        insertionSort.sort();
        mergeSort.sort();
        heapSort.sort();
        System.out.println("-------------------: ");
    }
    public static void zadanie2() throws MyException {
        System.out.println("Zadanie 2: ");
        Scanner in= new Scanner(System.in);
        System.out.println("Podaj liczby: ");
        List<Integer> list = new ArrayList<>();
        int tmp;
        for(int i=0;i<5;i++) {
            tmp=in.nextInt();
            if(tmp>=-1000 && tmp<=1000)
                list.add(i,tmp);
        }
        System.out.println("Podaj Target: ");
        int Target=in.nextInt();
        IfEqual ifEqual= new IfEqual();
        ifEqual.spot(list,Target);
        System.out.println("-------------------: ");
    }
    public static void zadanie3() throws MyException {
        System.out.println("Zadanie 3: ");
        Scanner in= new Scanner(System.in);
        List<Integer> list1 = new ArrayList<Integer>();

        System.out.println("Podaj liczby: ");
        int tmp;
        for(int i=0;i<8;i++) {
            tmp=in.nextInt();
            list1.add(i,tmp);
        }
        System.out.println("Podaj max:");
        int max=in.nextInt();
        Missing missing= new Missing();
        System.out.println(missing.missingNum(list1,max));
        System.out.println("-------------------: ");
    }
    public static void zadanie4() throws MyException {
        System.out.println("Zadanie 4: ");
        System.out.println("Podaj liczby: ");
        Scanner in= new Scanner(System.in);
        int[] array =new int[5];
        for(int i=0;i<array.length;i++) {
            array[i]=in.nextInt();
        }
        ReorderDigits reorderDigits=new ReorderDigits();
        System.out.println("Asc: ");
        for(int i = 0;i<array.length;i++) {
            reorderDigits.reorderDigits(array[i], "asc");
        }

        System.out.println("Desc: ");
        for(int i = 0;i<array.length;i++) {
            reorderDigits.reorderDigits(array[i], "desc");
        }
        System.out.println("-------------------: ");
    }

    public static void zadanie5() throws MyException {
        Scanner in = new Scanner(System.in);
        System.out.println("Zadanie 5: ");
        Kaprekar kaprekar = new Kaprekar();
        System.out.println("Podaj liczbe czterocyfrową:");
        int tmp = in.nextInt();
        System.out.println("Ilość iteracji: " + kaprekar.kaprekar(tmp));

    }
}
