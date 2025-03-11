package strings;

public class Stream {
    public static void main(String[] args) {
//        skip("", "abaccahd");
//        skipCharacter("", "abaccahd");
        System.out.println(skipCharacter2("abaccahd"));
    }

    static void skip(String processed, String unprocessed){
        if (unprocessed.isEmpty()){
            System.out.println(processed) ;
            return;
        }

        char ch = unprocessed.charAt(0);
        if (ch == 'a'){
            skip(processed, unprocessed.substring(1));
        }else{
           skip(processed+ch, unprocessed.substring(1));
        }
    }

    static void skipCharacter(String answerString, String originalString){
        if (originalString.isEmpty()){
            System.out.println("Answer "+answerString);
            return;
        }

        if (originalString.charAt(0) == 'a'){
            //skip that character & handover to the next function
            skipCharacter(answerString,originalString.substring(1));
        }else{
            skipCharacter(answerString + originalString.charAt(0), originalString.substring(1));
        }
    }

    // second way of skipping character
    static String skipCharacter2(String originalString){
        // first check if the originalString is empty or not
        if(originalString.isEmpty()){
            return originalString;
        }
//        char selfChar;
//
        if (originalString.charAt(0) == 'a'){
            // do not include it rather handover to the next function
           return skipCharacter2(originalString.substring(1));
        }else{
            // include current character & then send it
            return originalString.charAt(0) + skipCharacter2(originalString.substring(1));
        }
    }
}
