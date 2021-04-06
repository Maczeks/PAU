package zadanie3;

import zadanie6.MyException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Missing {
    public List<Integer>  missingNum(List<Integer> a, int max) throws MyException {
        boolean bool;
        List <Integer> missing=new ArrayList<Integer>();
        if(max<0) {
            throw new MyException("Źle zdefiniowana wartość max!");
        }
        for(int j=1;j<=max;j++) {
            bool=false;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i)==j) {
                    bool=true;
                }
            }
            if(bool==false){
                missing.add(j);
            }
        }
        return missing;
    }
}
