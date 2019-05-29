package com.zipcodewilmington;
import java.util.Arrays;
import java.util.*;
/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean answer = false;
        for(int i =0;i<array.length;i++){
            if(array[i].equals(value)){
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int counter = 0;
        String[] answer = new String[array.length];
        for(int i = array.length-1; i >= 0;i--){


            answer[counter] = array[i];
            counter++;
        }
        return answer;

    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int counter = 0;
        String[] answer = new String[array.length];
        for(int i = array.length-1; i >= 0;i--){


            answer[(answer.length-i)-1] = array[i];



        }


        System.out.println(array);
        System.out.println(array.equals(answer));
        return Arrays.equals(array,answer);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
    String str = Arrays.toString(array);
    Set <String> holder2 = new HashSet<>();

    String[] holder = str.split("");


    for(String x : holder){
        holder2.add(x.toLowerCase());

    }
    System.out.println(holder2);
    System.out.println(holder2.size());
    if(holder2.size() >= 26){
        return true;

    }else {


        return false;
    }
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(int i = 0; i < array.length;i++)
        if(Arrays.asList(array[i]).contains(value)){

          counter++;
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list,array);
        list.remove(valueToRemove);
        array =list.toArray(new String[list.size()]);
        return array;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list,array);
        for(int i = 1;i < list.size();i++){

            while(i < list.size() && list.get(i-1).equals(list.get(i))){

                list.remove(i);
            }
        }

        array =list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
        return array;


    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        Collections.addAll(list,array);
        String ben = "";

        for(int i = 1;i < list.size();i++){

            while(i < list.size() && list.get(i-1).equals(list.get(i))){

                ben +=list.get(i) ;
                list.remove(i);

            }
            ben +=list.get(i-1);

            list2.add(ben);
            ben = "";
        }
        if(list2.get(list2.size()-1).length() < 3){
            list2.add(list.get(list.size()-1));
            System.out.println("Hello");
        }

        array =list2.toArray(new String[list.size()]);

        return array;

    }


}
