package com.shubh.leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s) {

        Map<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('(', ')');
        parenthesis.put('[', ']');
        parenthesis.put('{', '}');

        Stack<Character> characterStack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (parenthesis.containsKey(c))
                characterStack.add(c);
            else if (parenthesis.containsValue(c)){
                if (!characterStack.empty() && parenthesis.get(characterStack.peek()) == c)
                    characterStack.pop();
                else
                    return false;
            }
        }

        return characterStack.empty();
    }

    public static void main(String[] args) {

        ValidParenthesis validParenthesis = new ValidParenthesis();
        boolean valid = validParenthesis.isValid("({");
        System.out.println("isValid >> " + valid);
    }
}
