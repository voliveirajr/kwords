package com.kwords.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

    private Character c = null;
    private int count = 0;
    private boolean isWord = false;
    private Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    //TODO: fixed, reimplement strategy to build words
    private static WordSet words = new WordSet(3);

    public TrieNode(Character c) {
        this.c = c;
    }

    public void addWord(String word) {
        TrieNode child = null;
        if (!children.containsKey(word.charAt(0))) {
            child = new TrieNode(word.charAt(0));
            if (word.length() == 1) {
                child.count++;
                child.isWord = true;
            } else {
                child.addWord(word.substring(1));
            }
            children.put(word.charAt(0), child);
        } else {
            child = children.get(word.charAt(0));
            if(word.length()>1){
                child.addWord(word.substring(1));
            }else{
                child.count++;
            }
        }
    }

    public static WordSet getWords(TrieNode node, String chars) {
        
        if(node.c!=null){
            chars += node.c;
        }
        if (node.isWord) {
            //words.put(chars.trim(), node.count);
            words.add(new WordNode(chars.trim(), node.count));
        }
        // If more letters still remain, continue traversing
        if (!node.children.isEmpty()) {
            for (Character c : node.children.keySet()) {
                getWords(node.children.get(c), chars);
            }
        }
        else {
            chars = "";
        }
        return words;
    }
}
