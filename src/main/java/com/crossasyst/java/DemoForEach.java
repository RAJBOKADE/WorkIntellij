package com.crossasyst.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 9);

//        for(int i = 0; i<values.size(); i++)
//        {
//            System.out.println(values.get(i));
//        }
        for(int i : values){
            System.out.println(i);
        }
        values.forEach(i -> System.out.println(i));
    }
}
