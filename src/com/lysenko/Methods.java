package com.lysenko;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by dsk11 on 8/21/2018.
 */
public class Methods {

    //
    public int countA1(List<String> list){
        int count = 0;
        for (int i = 0; i <list.size() ; i++) {
            String value = list.get(i);
            if ("a1".equals(value)){
                count++;
            }
        }
        return  count;
    }

    public String firstElement(List<String> list){
        String result = "0";

        for (int i = 0; i < list.size() ; i++) {
            String value = list.get(i);
            if ( value != null) {
                result = value;
            }
        }
        return result;
    }

    public String lastElement(List<String> list){
        String result = "Empty";
        for (int i = 0; i < list.size(); i++) {
            String value = list.get(i);
            if ( value != null){
                result = value;
            }
        }
        return  result;
    }

    public String thirdElement(List<String> list){

            if (list.size() < 3) {
            NoSuchElementException noSuchElementException =
                    new NoSuchElementException("Third is empty");
            throw noSuchElementException;
        }
        return list.get(3-1);
    }

}

