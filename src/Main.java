public class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public static int[] combine(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length * 2];
        for (int i = (array1.length)*2; i < array3.length-1; i--) {
            array3[((array1.length)*2)-i] = array2[array2.length-i];
            array3[array1.length-1] = array1[array1.length-1];
        }
        return array3;
        //??

    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static int[] zip(int[] array1, int[] array2) {
        int[] result = new int[array1.length*2];
        for(int i = 0; i<result.length-1; i++){
            result[i] = array1[i];
            result[i+1] = array2[i];
        }
        return result;
    }
    //?

    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    public static int[] product(int[] array1, int[] array2) {

        for(int i = 0; i<array1.length; i++){
            int a = array1[i];

            array2[i] = array2[i]*a;

        }
        return array2;

    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    public static int[] capitalCount(String[] words) {
        String[] newarray = new String[words.length];
        for(int i = 0; i<words.length; i++){
            newarray[i] = String.valueOf(countCapitalLetters(words[i]));
        }
        return newarray;
        //?????


    }

    public static int countCapitalLetters(String word) {

        int count = 0;
        for(int i = 0; i<word.length()-1; i++){
            if(word.substring(i,i+1).equals("A") || word.substring(i,i+1).equals("B") ||word.substring(i,i+1).equals("C") ||word.substring(i,i+1).equals("D") ||word.substring(i,i+1).equals("E") ||word.substring(i,i+1).equals("F") ||word.substring(i,i+1).equals("G") ||word.substring(i,i+1).equals("H") ||word.substring(i,i+1).equals("I") ||word.substring(i,i+1).equals("J") ||word.substring(i,i+1).equals("K") ||word.substring(i,i+1).equals("L") ||word.substring(i,i+1).equals("M") ||word.substring(i,i+1).equals("N") ||word.substring(i,i+1).equals("O") ||word.substring(i,i+1).equals("P") ||word.substring(i,i+1).equals("Q") ||word.substring(i,i+1).equals("R") ||word.substring(i,i+1).equals("S") ||word.substring(i,i+1).equals("T") ||word.substring(i,i+1).equals("U") ||word.substring(i,i+1).equals("V") ||word.substring(i,i+1).equals("W") ||word.substring(i,i+1).equals("X") ||word.substring(i,i+1).equals("Y") ||word.substring(i,i+1).equals("Z") ){
                count++;
            }
        }
        return count;
    }


}
