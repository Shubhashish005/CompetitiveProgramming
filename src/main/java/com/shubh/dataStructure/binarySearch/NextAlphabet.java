package com.shubh.dataStructure.binarySearch;

public class NextAlphabet {

    private static final char[] characters = {'a', 'c', 'f', 'h', 'i', 'j', 'k', 'l'};
    private static final char characterToCheck = 'f';

    private char fetchNextAlphabet(int start, int end) {

        char result = '1';
        while (start <= end) {

            int mid = (start + end) / 2;
            if (characterToCheck == characters[mid])
                start = mid + 1;
            else if (characters[mid] < characterToCheck)
                start = mid + 1;
            else if (characters[mid] > characterToCheck) {
                result = characters[mid];
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        NextAlphabet nextAlphabet = new NextAlphabet();
        char c = nextAlphabet.fetchNextAlphabet(0, characters.length - 1);
        System.out.println("Next character >> " + c);
    }
}
