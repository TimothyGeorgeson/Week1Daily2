package com.example.user.firstdaycoding;
import java.util.*;

public class FirstDayCoding {
    public static void main(String[] args) {

        List<String> input = Arrays.asList("cat", "cat", "pig", "cat");

        findDuplicates(input);
        System.out.println(checkPalindrome("racecar"));
        fizzBuzz(20);
        System.out.println(checkAnagram("COAT", "TACO"));

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
        for (int i=1; i<=count; i++)
        {
            if (i%3 == 0)
            {
                if (i%5 == 0)
                {
                    System.out.println("fizzbuzz");
                }
                else
                {
                    System.out.println("fizz");
                }
            }
            else if(i%5 == 0)
            {
                System.out.println("buzz");
            }
            else
            {
                System.out.println(i);
            }

        }
    }

    public static boolean checkAnagram(String word1, String word2)
    {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        String sorted1 = new String(chars1);
        String sorted2 = new String(chars2);


        if (sorted1.equals(sorted2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void printTables(){

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

