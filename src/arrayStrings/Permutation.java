


import java.util.Arrays;
import java.util.Scanner;

public class Permutation {
    /*
    *  Check Permutation : Given two strings, write a method to decide if one is a permutation of the other.
    */

    public static boolean checkPermutation (String[] words){

        //If both word has different size, return false
        if(words[0].length() != words[1].length()){
            return false;
        }

        char[] str1 = words[0].toLowerCase().toCharArray();
        char[] str2 = words[1].toLowerCase().toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        //Check Both Strings
        for(int idx=0; idx<words[0].length(); idx++){
            if(str1[idx]!=str2[idx]){
                return false;
            } 
        }
        return true;
    }

    public static void main (String[] args){

        String[] words = new String[2];
        Scanner sc = new Scanner(System.in);

        //Receive two words
        for(int i=0; i<2; i++){
            words[i]=sc.nextLine();
        }


        //Check permutation
        System.out.println(checkPermutation(words));

        sc.close();

    }

}

