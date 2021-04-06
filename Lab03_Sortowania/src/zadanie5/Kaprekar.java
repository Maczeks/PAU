package zadanie5;

import zadanie4.ReorderDigits;
import zadanie6.MyException;

import javax.swing.*;
import java.util.Objects;
import java.util.Scanner;

public class Kaprekar {

    public int reorderDigits(int array,String type) throws MyException {
        if (type.equals("asc")) {
            int counter1=0;
            Scanner scanner = new Scanner(System.in);
            int length = Integer.toString(array).length();
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
            int asc = Integer.parseInt(result);
            return asc;
        }
        else if(type.equals("desc")) {
            int counter2=0;
            Scanner scanner = new Scanner(System.in);
            int length = Integer.toString(array).length();
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
            return desc;
        }
        return 0;
    }

    public int kaprekar(int a) throws MyException {
        int number1;
        int number2;
        int iterator=0;
        //number1=reorderDigits(a,"asc");
        //System.out.println(number1);

        while(a!=6174) {
            System.out.println("a: " + a);
            number1 = reorderDigits(a, "asc");
            number2 = reorderDigits(a, "desc");

            if(number1>number2)
                a=number1-number2;
            else
                a=number2-number1;
            iterator+=1;
        }
        System.out.println("a: " + a);
        return iterator;
    }
}
