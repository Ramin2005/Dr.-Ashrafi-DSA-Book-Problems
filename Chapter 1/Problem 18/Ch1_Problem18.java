
public class Ch1_Problem18 {

    public static boolean isDuplicate(String s) {

        //get length of string
        int length = s.length();

        //if length is odd, return false
        if (length % 2 == 1) {
            return false;
        }

        //base case: if length is 0, return true
        if (length == 0) {
            return true;
        } else {
            //split string into two halves
            String temp1 = s.substring(0, length / 2);
            String temp2 = s.substring(length / 2);

            //compare two halves
            if (temp1.equals(temp2)) {
                //if equal, check for duplicates in the first half
                return isDuplicate(temp1.substring(1));
            } else {
                //if not equal, return false
                return false;
            }
        }
    }
}
