package Controler;

import Logics.PrimeFind;
import Moduler.Link;
import Moduler.LinkedList;

public class HashTable {

    private LinkedList[] hashArray;
    private int araySize;
    private PrimeFind pf = new PrimeFind();
    private String instanceName="";

    public HashTable(int size) {

        araySize = pf.getPrime(size);
        hashArray = new LinkedList[araySize];

        for (int i = 0; i < araySize; i++) {

            hashArray[i] = new LinkedList();
        }
    }

    public int hash(String key) {

        int hashvalue = 0;

        for (int i = 0; i < key.length(); i++) {

            hashvalue = (hashvalue * 32 + key.charAt(i)) % araySize;
        }
        return hashvalue;
    }

    public boolean find(String key) {

        int hashVal = hash(key);
        boolean bool = hashArray[hashVal].find(key);
        return bool;
    }

    public void dispalyTable() {

        for (int i = 0; i < araySize; i++) {

            System.out.print(i + ". ");
            hashArray[i].displayList();
        }
    }

    public void insert(Link theLink) {

        String key = theLink.getString();
        int hashValue = hash(key);
        hashArray[hashValue].insert(theLink);
    }

    public void setName(String name) {

        instanceName = name;
    }

    public String getName() {
    
        return instanceName;
    }

}
