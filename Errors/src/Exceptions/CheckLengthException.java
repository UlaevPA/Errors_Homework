package Exceptions;

public class CheckLengthException {
    public static int checkLengthException(String str){
        String[] strArr = str.split(" ");
        if (strArr.length == 6){
            return strArr.length;
        } else{
            return -1;
        }
    }
}
