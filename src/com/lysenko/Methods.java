package com.lysenko;

import java.util.List;

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
}

