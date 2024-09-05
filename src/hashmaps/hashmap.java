package hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
       int[] arr = {1,2,2,2,2};
       String s = "aabbcccdd";
       int[] ans = countletters(s);
        System.out.println(Arrays.toString(ans));
    }

    static int[] countFrequencies(int[] arr, int n) {
        // Create a HashMap to store the frequency of each number from 1 to n
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Initialize the HashMap with all numbers from 1 to n with frequency 0
        for (int i = 1; i <= n; i++) {
            frequencyMap.put(i, 0);
        }

        // Iterate through the array and update the frequency in the HashMap
        for (int num : arr) {
            if (num >= 1 && num <= n) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            }
        }

        // Create an output array to store the frequencies
        int[] frequencies = new int[n];

        // Populate the output array with the frequencies from the HashMap
        for (int i = 1; i <= n; i++) {
            frequencies[i - 1] = frequencyMap.get(i);
        }

        return frequencies;
    }
    static int[] countletters(String s) {
        // Create a HashMap to store the frequency of each number from 1 to n
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Initialize the HashMap with all numbers from 1 to n with frequency 0
        for (char ch = 'a';ch<='z';ch++) {
            frequencyMap.put(ch, 0);
        }
        s= s.toLowerCase();

        // Iterate through the array and update the frequency in the HashMap
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            }
        }

        // Create an output array to store the frequencies
        int[] frequencies = new int[26];
        // Populate the output array with the frequencies from the HashMap
        for (char ch ='a';ch <= 'z';ch++) {
            frequencies[ch - 'a'] = frequencyMap.get(ch);
        }

        return frequencies;
    }

}
