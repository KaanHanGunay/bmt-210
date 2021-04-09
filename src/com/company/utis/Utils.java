package com.company.utis;

import com.company.linkedlist.LinkedList;

public class Utils {

    public static LinkedList getPrimeFactors (int number) {
        LinkedList linkedList = new LinkedList();
        if(number < 1) {
            return null;
        } else {
            int factor = 2;
            while(number != 1)
            {
                if(number % factor == 0)
                {
                    number = number / factor;
                    linkedList.addNewNode(factor);
                    factor = 2;
                } else {
                    factor++;
                }
            }

            System.out.println(linkedList.getListOfValues());
            return linkedList;
        }
    }
}
