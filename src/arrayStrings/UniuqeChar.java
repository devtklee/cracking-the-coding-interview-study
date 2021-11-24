
import java.util.Hashtable;
import java.util.Scanner;

public class UniuqeChar {
    /*
    * Is Unique : Implement an algorithm to determine if a string has all unique characters.
    * What if you cannot use additional data structure
    * */

    public static boolean isUnique(String str){

        str=str.toLowerCase();
        Hashtable<Character, Integer> charList = new Hashtable<Character, Integer>();
        if (str.isEmpty()){
            return false;
        }

        for (int idx=0; idx<str.length(); idx++){

            Character k = str.charAt(idx);

            if (charList.containsKey(k)){
                return false;
            } else {
                charList.put(k,1);
            }

        }

        return true;
    }

    public static void main (String[] args){

    String inStr=args[0];
    System.out.print(inStr + (isUnique(args[0])==true?" ":" doesn't ") + "have all unique characters" );

    }


}
