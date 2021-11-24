import java.util.Hashtable;

public class PalindromePermutation {

    public static boolean checkPermutation (String s ){
        
        //Initialize variable.
        Hashtable<Character, Integer> charcnt = new Hashtable<>();
        int curCnt=0;

        //Remove whitespaces and change to lowercases.
        s=s.toLowerCase().replaceAll("\\s+","");

        //Count number of characters in String using Hashtable.
        for (int i=0; i<s.length(); i++){
            int value=0;
            //Count number of characters from the String
            if (charcnt.containsKey(s.charAt(i))){
                value=charcnt.get(s.charAt(i));
                charcnt.put(s.charAt(i), ++value);
            } else {
                charcnt.put(s.charAt(i), 1);
            }
        }

        /*
        After counting characters, divide each count by 2 and add reminder to curCnt.
        If sum of curCnt is equal to 0 or 1, it means given string is palindrome. Return true.
        */
        for (Character key:charcnt.keySet()){
            curCnt+=charcnt.get(key)%2;
        }

        return curCnt<=1?true:false;
        
    }

    public static void main (String[] args){
        
        System.out.println(checkPermutation(args[0]));
    }
    
}
