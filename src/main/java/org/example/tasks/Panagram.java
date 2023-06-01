package org.example.tasks;

import java.util.Set;
import java.util.TreeSet;

/**
 * Given a string and return true/false if the string is panagram.
 */
public class Panagram {

    public boolean isPanagram(String sentence) {
        char[] chars = sentence.toCharArray();
        Set<Character> charSet = new TreeSet<>();
        for(char c: chars){
            if(Character.isAlphabetic(c)) charSet.add(Character.toUpperCase(c));
        }
        System.out.println("charSet :" + charSet.toString() + " size:" + charSet.size());
        return charSet.size() ==26;
    }
}
