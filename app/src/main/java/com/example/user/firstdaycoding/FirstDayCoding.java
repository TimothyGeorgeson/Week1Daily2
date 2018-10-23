package com.example.user.firstdaycoding;
import java.util.*;

public class FirstDayCoding {
    public static void main(String[] args) {

        //Problem 1
        System.out.println("Problem 1:");
        List<String> input = Arrays.asList("cat", "dog", "pig", "cat", "dog", "dog");
        findDuplicates(input);
        System.out.println();

        //Problem 2
        System.out.println("Problem 2:");
        System.out.println(checkPalindrome("racecar"));
        System.out.println();

        //Problem 3
        System.out.println("Problem 3:");
        fizzBuzz(20);
        System.out.println();

        //Problem 4
        System.out.println("Problem 4:");
        System.out.println(checkAnagram("COAT", "TACO"));
        System.out.println();

        //Problem 5
        System.out.println("Problem 5:");
        printTables();
    }

    private static void findDuplicates(List<String> strings)
    {
        Map<String, Boolean> mapping = new HashMap<>();

        //Populate Hashmap, setting value to true if duplicate, false if not
        for(int i=0; i<strings.size(); i++){
            if (mapping.containsKey(strings.get(i)))
                mapping.put(strings.get(i), true);
            else
                mapping.put(strings.get(i), false);
        }

        //Print out Hashmap entries if their value is true, meaning they are duplicate
        for (Map.Entry<String, Boolean> entry : mapping.entrySet()) {
            if (entry.getValue() == true)
            {
                System.out.println(entry.getKey());
            }
        }
    }

    private static boolean checkPalindrome(String word)
    {
        for (int i=0; i < word.length(); i++)
        {
            //compares first char to last char, 2nd char to 2nd last char, etc.
            int j = word.length() - i - 1;
            if (word.charAt(i) != word.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    private static void fizzBuzz(int count)
    {
        for (int i=1; i<=count; i++)
        {
            if (i%3 == 0)
            {
                if (i%5 == 0)
                    System.out.println("fizzbuzz");
                else
                    System.out.println("fizz");
            }
            else if(i%5 == 0)
                System.out.println("buzz");
            else
                System.out.println(i);
        }
    }

    private static boolean checkAnagram(String word1, String word2)
    {
        Map<Character, Integer> mapping1 = new HashMap<>();
        Map<Character, Integer> mapping2 = new HashMap<>();

        for(int i=0; i<word1.length(); i++)
        {
            if(mapping1.containsKey(word1.charAt(i)))
                mapping1.put(word1.charAt(i), mapping1.get(word1.charAt(i)) + 1);
            else
                mapping1.put(word1.charAt(i), 1);
        }

        for(int i=0; i<word2.length(); i++)
        {
            if(mapping2.containsKey(word2.charAt(i)))
                mapping2.put(word2.charAt(i), mapping2.get(word2.charAt(i)) + 1);
            else
                mapping2.put(word2.charAt(i), 1);
        }

        if(mapping1.equals(mapping2))
            return true;
        else
            return false;
    }

    private static void printTables(){
        int[][] table = new int[10][10];

        //populating 2D array table
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                table[i][j] = (i+1) * (j+1);
            }
        }

        //printing out the 2D table
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

}

//Week 1 Daily 2
//Problem 1
//Create a function to print the duplicates in a list of strings
//public void findDuplicates(List<String> strings){};

//Problem 2
//Create a function to check if the string is a palindrome
//public boolean checkPalindrome(String word){};

//Problem 3
//Create a function that will print
// "fizz" if the number is divisible by 3
// "buzz" if the number is divisible by 5
// "fizzbuzz" if the number is divisible by both
// and the integer for the rest
//You can use a for loop for using the first 20 integers
//public void fizzBuzz(int count){};

//Problem 4
//Create a function to check if the two strings are Anagrams
//Eg COAT and TACO would be anagrams
//public boolean findAnagram(String word1, String word2){};

//Problem 5
//Print a multiplication table from 1 to 10 using multidimensional array
//Output
//1 2 3 4 5 6 7 8 9 10
//2 4 6 8 10 12 14 16 18 20
//...
//public void printTables(){};

