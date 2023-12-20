package Study.HashTable;

import java.util.ArrayList;

public class MyHashSet {

    private final int SIZE = 1000;
    private ArrayList<Integer> myBuckets[];
    MyHashSet(){
        myBuckets = new ArrayList[SIZE];
        for (int i = 0; i < myBuckets.length; i++) {
            myBuckets[i] = new ArrayList<>();
        }
    }

    //return hash value (index cua bucket)
    private int hashFunction(int key){
        return key % SIZE;
    }

    public void add(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex < 0){
            bucket.add(key);
        }
    }

    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        if(keyIndex >= 0){
            bucket.remove(keyIndex);
        }
    }

    public boolean contains(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        int keyIndex = bucket.indexOf(key);
        return keyIndex >= 0;
    }

    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        myHashSet.add(1);
        myHashSet.add(3);
        System.out.println("mySet contains(1): "+myHashSet.contains(1));
        myHashSet.remove(1);
        System.out.println("mySet contains(1): "+myHashSet.contains(1));
    }
}
