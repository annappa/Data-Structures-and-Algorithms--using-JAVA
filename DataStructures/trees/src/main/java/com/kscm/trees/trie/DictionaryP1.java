package com.kscm.trees.trie;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DictionaryP1 {

    public DictionaryP1() {

    }

    private static void findAllWords( List<String> dictionary, String pattern ) {
        TrieNodeP1 root = null;
        for(String word : dictionary) {
            root = insert(root, word);
        }

        TrieNodeP1 curr = root;
        for(char ch : pattern.toCharArray()) {
            if(curr.getChildern().containsKey(ch)) {
                curr = curr.getChildern().get(ch);
            }

            if(curr == null) {
                return;
            }
        }

        printAllWords(curr);
    }

    private static TrieNodeP1 insert(TrieNodeP1 root, String word) {
        if( root == null) {
            root = new TrieNodeP1();
        }

        TrieNodeP1 curr = root;
        for(char ch : word.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                curr.getChildern().putIfAbsent(ch, new TrieNodeP1());
                curr = curr.getChildern().get(ch);
            }
        }

        curr.setLeaf(true);
        curr.getMacthedWords().add(word);
        return root;
    }

    private static void printAllWords(TrieNodeP1 root) {
        if(root == null) {
            return;
        }

        if(root.isLeaf()) {
            System.out.println(root.getMacthedWords());
        }

        for(Map.Entry<Character, TrieNodeP1> entry : root.getChildern().entrySet()) {
            TrieNodeP1 child = entry.getValue();
            printAllWords(child);
        }
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("Hi", "HiTech", "HiTechCity", "Techie",
                "TechieDelight", "Hello", "HelloWorld", "HiTechLab");
        String pattern = "HT";
        findAllWords(dictionary, pattern);

        String pattern1 = "H";
        System.out.println("-------- Pattern: H -------");
        findAllWords(dictionary, pattern1);
    }
}
