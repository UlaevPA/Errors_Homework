package Input;

import java.util.Scanner;

public class Input {
//    String inputData;
//
//    public Input(String inputData) {
//        this.inputData = inputData;
//    }

    public static String getData(){
        String data;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите через пробел ФИО, дату рождения, номер телефона, пол");
        System.out.println(">>> ");
        data = scanner.nextLine();
        return data;
    }
}