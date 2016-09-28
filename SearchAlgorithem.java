package Logics;

import Controler.HashTable;
import Controler.StringOperations;

public class SearchAlgorithem {

    private StringOperations sop = new StringOperations();

    public void find(String key, HashTable table) {

        boolean result1 = false;
        boolean result2 = false;
        
        key=key.toLowerCase();

        if (sop.andCheck(key) == true) {

            key = sop.replaceAnd(key);

            String[] wordarry = sop.splitInput(key);
            String value1 = wordarry[0];
            String value2 = wordarry[1];

            result1 = table.find(value1);
            result2 = table.find(value2);

            if ((result2 == true) && (result1 == true)) {

                System.out.print(table.getName()+",");
            }

        } else if (sop.orCheck(key) == true) {

            key = sop.replaceOr(key);

            String[] wordarry = sop.splitInput(key);
            String value1 = wordarry[0];
            String value2 = wordarry[1];

            result1=table.find(value1);
            result2=table.find(value2);

            if ((result2 == true) || (result1 == true)) {

                System.out.print(table.getName()+",");
            }

        } else {

            boolean result = table.find(key);
            if (result == true) {

                System.out.print(table.getName()+",");
            } else {

                System.out.print(" ");
            }

        }
    }

}
