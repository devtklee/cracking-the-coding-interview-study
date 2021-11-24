public class URLify{
    
    public static final String rplWord="%20";

    public static String replaceSpace (String line, int cnt){
        
        StringBuilder sentence = new StringBuilder();

        //While scaning each chacaracters from the received String, append to reserved word if character is whitespace.
        for (int idx=0; idx<cnt; idx++){

            if(Character.isWhitespace(line.charAt(idx))){
                //If poinitng character is whitespace, append reserved word.
                sentence.append(rplWord);
            } else{
                sentence.append(line.charAt(idx));
            }
        }

        //Return re-built string without whitespace
        return sentence.toString();
    }

    public static void main (String[] args){  

        System.out.println(replaceSpace(args[0], Integer.parseInt(args[1])));
            
    }

}