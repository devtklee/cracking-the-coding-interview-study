import java.util.Arrays;

public class OneAway {
    
    public static boolean isOneAway (String before, String after){
        
        int minCnt=0;    
        int diff=0;
        char[] beforeChar = before.toCharArray();
        char[] afterChar = after.toCharArray();

        //Sort each characters
        //Arrays.sort(beforeChar);
        //Arrays.sort(afterChar);

        if (Math.abs(beforeChar.length-afterChar.length)>1){
            return false;
        } else if (beforeChar.length>afterChar.length){
            minCnt=beforeChar.length;
        } else{
            minCnt=afterChar.length;
        }

        for(int idx=0; idx<minCnt; idx++){
            System.out.println("=============================");
            System.out.println("Before : " + beforeChar[idx]);
            System.out.println("After : " + afterChar[idx]);
            System.out.println("=============================\n");
            if(beforeChar[idx]!=afterChar[idx]){
                if(diff>1){
                    return false;
                }
                diff++;
            }
        }

        return true;
    }

    public static void main(String[] args){

        System.out.println(isOneAway(args[0], args[1]));

    }
    
}
