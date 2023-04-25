package classes;

import java.io.*;
import java.net.http.HttpRequest;

public class FileService {

    public String getFirstLineForFile(String fileName) {
        File file = new File(fileName);

//try-with-resources
        try (FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            System.out.println("try");
            String answer = bufferedReader.readLine();
            return answer;
        } catch (IOException e) {
            System.out.println("catch");
            throw new RuntimeException();
        } finally {
            System.out.println("finally");
            //разрыв соединение
            //финально
        }

        //Пользователь с консоли вводит имя файла
        //Далее пользователь вводит строку

        //Записать в файл строку
        //ВАЖНО: обработать исключения

        //Доп. задача - добавить блок finally, в нем любое сообщение на экран
    }

}
