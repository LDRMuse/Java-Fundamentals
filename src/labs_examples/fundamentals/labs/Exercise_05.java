package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int lengthOfStr = str.length();
        System.out.println(lengthOfStr);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equalStrings = str.equals(str2);
        System.out.println("Are the strings equal? " + equalStrings);

        // please concatenate str & str2 and set the result to a new String variable below
        String oneString = str + " " + str2;
        System.out.println(oneString);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

        // replace
        System.out.println(str.replace("hello", "goodbye"));

        String word = "supercalifragilisticexpialidocious";

        // substring
        String usingTheSubStringMethod = word.substring(2,3);
        System.out.println("What is the letter between index 2 and index 3? " + usingTheSubStringMethod);
        String anotherSubString = "This sentence is a String.";
        System.out.println(anotherSubString.substring(4,13));

        // contains
        boolean usingTheContainsMethod = word.contains("z");
        System.out.println("Does " + word + " contain the letter z? " + usingTheContainsMethod);

        // indexOf
        int usingTheIndexOfMethod = word.indexOf("x");
        System.out.println("At what index is the letter 'x'? " + usingTheIndexOfMethod);


    }


}