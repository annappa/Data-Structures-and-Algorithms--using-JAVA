package com.kscm.trees.trie;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrieNodeP1 {

    private Map<Character, TrieNodeP1> childern = new HashMap<>();

    private Set<String> macthedWords = new HashSet<>();

    private boolean isLeaf;

    public TrieNodeP1() {

    }

    public Map<Character, TrieNodeP1> getChildern() {
        return childern;
    }

    public void setChildern(Map<Character, TrieNodeP1> childern) {
        this.childern = childern;
    }

    public boolean isLeaf() {
        return isLeaf;
    }

    public void setLeaf(boolean leaf) {
        isLeaf = leaf;
    }

    public Set<String> getMacthedWords() {
        return macthedWords;
    }

    public void setMacthedWords(Set<String> macthedWords) {
        this.macthedWords = macthedWords;
    }
}
