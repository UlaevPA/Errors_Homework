import Exceptions.CheckGender;
import Exceptions.CheckLengthException;
import Input.Input;
import Persona.Persona;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    private static void inputDescription() {
        System.out.println("Введите через пробел ФИО, дату рождения, номер телефона и пол");
        System.out.println("Дата рождения в формате ДД.ММ.ГГГГ");
        System.out.println("Номер телефона без знаков '+' или '-'");
    }

    private static void chooseDescription() {
        System.out.println("Для ввода строки введите 'n', для выхода 'q'");
        System.out.println(">>> ");
    }

    public static void appPlay() {
        Scanner scanner = new Scanner(System.in);
        char userButton = 'n';
        while (userButton != 'q') {
            Application.chooseDescription();
            userButton = scanner.next().charAt(0);
            switch (userButton) {
                case 'q':
                    System.out.println("Работа программы завершена!");
                    return;
                case 'n':
                    Application.inputDescription();
                    String data = Input.getData();
                    if (CheckLengthException.checkLengthException(data) == 6){
                        Persona p = new Persona();
                        try{
                            p.setPersona(data);
                            if (CheckGender.checkGender(p.gerGender()) == 1){
                                File file = new File(p.getLastName());
                                if (file.exists()) {
                                    try (FileWriter fileWriter = new FileWriter(p.getLastName(), true)) {
                                        fileWriter.write(p.toString());
                                        fileWriter.write("\n");
                                        System.out.println("Файл обновлен!");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } else {
                                    try (FileWriter fileWriter = new FileWriter(p.getLastName())) {
                                        fileWriter.write(p.toString());
                                        fileWriter.write("\n");
                                        System.out.println("Файл создан");
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                            } else {
                                System.out.println("Существует только 2 пола: (f) - female и (m) - male");
                            }

                        } catch (NumberFormatException e){
                            System.out.println("Введите корректный номер телефона");
                        }


                    } else {
                        System.out.println("Вы ввели некорректные данные");
                        System.out.println("Код ошибки: ");
                        System.out.println(CheckLengthException.checkLengthException(data));
                    }

                    break;
            }
        }
    }
}