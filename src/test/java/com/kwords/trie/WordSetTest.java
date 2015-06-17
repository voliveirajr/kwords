package com.kwords.trie;

import org.junit.Assert;
import org.junit.Test;

import com.kwords.trie.WordNode;
import com.kwords.trie.WordSet;

public class WordSetTest {
    
    @Test
    public void testSet(){
        
        WordSet wordSet = new WordSet(3);
        
        WordNode node;
        
        node = new WordNode("t4", 4);
        wordSet.add(node);
        node = new WordNode("t5", 5);
        wordSet.add(node);
        node = new WordNode("t2", 2);        
        wordSet.add(node);
        node = new WordNode("t6", 6);        
        wordSet.add(node);
        node = new WordNode("t10", 10);
        wordSet.add(node);
        node = new WordNode("t3", 3);
        wordSet.add(node);
        node = new WordNode("t1", 1);
        wordSet.add(node);
        
        WordNode n;
        n = wordSet.pollLast();
        Assert.assertTrue(n.getCount() == 10);
        n = wordSet.pollLast();
        Assert.assertTrue(n.getCount() == 6);
        n = wordSet.pollLast();
        Assert.assertTrue(n.getCount() == 5);
    }   

}
