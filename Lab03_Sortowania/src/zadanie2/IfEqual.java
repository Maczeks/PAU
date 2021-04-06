package zadanie2;

import zadanie6.MyException;

import java.util.Iterator;
import java.util.List;

public class IfEqual {
    public static void spot(List<Integer> a, int Target) throws MyException {
        boolean bool=false;
        for(int i=0;i<a.size();i++) {
            for(int j=0;j<a.size();j++)
                if((a.get(i)+a.get(j))==Target) {
                    System.out.println("Indeksy:" + i + " " + j);
                    bool=true;
                    return;
                }
        }
        if(bool==false) {
            throw new MyException("Brak rozwiązania dla tej tablicy!");
        }
    }
}
