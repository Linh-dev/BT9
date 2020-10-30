package com.company;

import java.util.ArrayList;

public class Manage {
    public ArrayList<Document> arr;

    public void add(Document d){
        arr.add(d);
    }

    public Document search(int id){
        int size = arr.size();
        if (size > 0){
            for (Document d : arr){
                if (d.getId() == id){
                    return d;
                }return null;
            }
        }return null;
    }

}
