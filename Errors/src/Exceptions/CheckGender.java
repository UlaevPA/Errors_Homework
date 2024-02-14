package Exceptions;

public class CheckGender {

    public static int checkGender(char ch){
        if (ch == 'm' || ch == 'f') return 1;
        else return 0;
    }
}