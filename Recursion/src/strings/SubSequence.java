package strings;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
//        allSubSequence("", "abc");
        System.out.println(allSubSequenceWithReturnArray("", "abc").toString());
    }

    static void allSubSequence(String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.println("Ans -->"+ processed);
            return;
        }

        allSubSequence(processed+unProcessed.charAt(0), unProcessed.substring(1));
        allSubSequence(processed, unProcessed.substring(1));
    }

    static ArrayList<String> allSubSequenceWithReturnArray(String answerString, String originalString){

        if (originalString.isEmpty()){
          ArrayList<String> list = new ArrayList<>();
          list.add(answerString);
          return list;
        }

        // Include first one
        ArrayList<String> left = allSubSequenceWithReturnArray(answerString + originalString.charAt(0), originalString.substring(1));

        // discard the character
        ArrayList<String> right = allSubSequenceWithReturnArray(answerString, originalString.substring(1));

       left.addAll(right);
        return left;
    }
}
