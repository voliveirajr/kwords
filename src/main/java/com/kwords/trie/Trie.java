package com.kwords.trie;

import java.util.Map;

public class Trie {
	
	private TrieNode root = new TrieNode(null);
	
	public void addWord(String word){
		root.addWord(word);
	}
	
	public Map<String, Integer> getWords(){
		return TrieNode.getWords(root, "");		
	}

}
