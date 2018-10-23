package com.example.user.firstdaycoding;
import java.util.*;

public class FirstDayCoding {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("cat", "dog", "pig", "cat");

        findDuplicates(input);
        System.out.println(checkPalindrome("racecar"));

    }

    public static void findDuplicates(List<String> strings)
    {
        List<String> temp = new ArrayList<String>();
        for(int i=0; i<strings.size(); i++){
            if (temp.contains(strings.get(i)))
            {
                System.out.println(strings.get(i));
            }
            temp.add(strings.get(i));
        }
    }

    public static boolean checkPalindrome(String word)
    {
        for (int i=0; i < word.length(); i++)
        {
            int j = word.length() - i - 1;
            if (word.charAt(i) != word.charAt(j))
            {
                return false;
            }
        }
        return true;
    }

    public static void fizzBuzz(int count)
    {

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
//public boolean findDuplicates(String word1, String word2){};

//Problem 5
//Print a multiplication table from 1 to 10 using multidimensional array
//Output
//1 2 3 4 5 6 7 8 9 10
//2 4 6 8 10 12 14 16 18 20
//...
//public void printTables(){};

