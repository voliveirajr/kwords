package com.kwords.trie;

import java.util.Comparator;
//import java.util.PriorityQueue;
import java.util.TreeSet;

public class WordSet extends TreeSet<WordNode>{

    private Integer capacity = null;
    
    public WordSet(Integer capacity){
        super(new Comparator<WordNode>() {
            @Override
            public int compare(WordNode o1, WordNode o2) {
                return o1.getCount().compareTo(o2.getCount());
            }
        });
        this.capacity = capacity;
    }

    @Override
    public boolean add(WordNode e) {
        boolean b = super.add(e);
        if (size() > capacity){
            pollFirst();
        }
        return b;
    }
    
}
