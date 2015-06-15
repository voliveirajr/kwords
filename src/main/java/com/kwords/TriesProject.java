package com.kwords;

import java.util.Map;

import com.kwords.trie.Trie;

public class TriesProject {

	public static void main(String[] args) {
		Trie t = new Trie();
		
		t.addWord("abc");
		t.addWord("abc");
		t.addWord("abcde");
		t.addWord("abcde");
		t.addWord("abcde");
		t.addWord("fghij");
		
		Map<String, Integer> m = t.getWords();
		
		for (String word : m.keySet()) {
			System.out.println(word+" "+m.get(word));
		}
	}

}
