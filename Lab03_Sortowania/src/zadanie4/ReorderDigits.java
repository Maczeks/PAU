package zadanie4;

import zadanie6.MyException;

import java.util.Scanner;

public class ReorderDigits {
    public static void reorderDigits(int array,String type) throws MyException {
        if (type.equals("asc")) {
            Scanner scanner = new Scanner(System.in);
            int length = Integer.toString(array).length();
            if(length==1) {
                throw new MyException("Podano liczbę jednocyfrową!");
            }
            int a[] = new int[length];
            int num = array;
            int i = 0;
            while(num != 0){
                a[i] = num % 10;
                num /= 10;
                i++;
            }
            for(i = 0; i < length; i++){
                for(int j = 0; j < length - 1 - i; j++){
                    if(a[j] > a[j + 1]){
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            String result = "";
            for(i = 0; i < length; i++)
                result += a[i];
            int desc = Integer.parseInt(result);
            System.out.println(desc);
        }
        else if(type.equals("desc")) {
            Scanner scanner = new Scanner(System.in);
            int length = Integer.toString(array).length();
            if(length==1) {
                throw new MyException("Podano liczbę jednocyfrową!");
            }
            int a[] = new int[length];
            int num = array;
            int i = 0;
            while(num != 0){
                a[i] = num % 10;
                num /= 10;
                i++;
            }
            for(i = 0; i < length; i++){
                for(int j = 0; j < length - 1 - i; j++){
                    if(a[j] < a[j + 1]){
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            String result = "";
            for(i = 0; i < length; i++)
                result += a[i];
            int desc = Integer.parseInt(result);
            System.out.println(desc);
        }
    }
}
