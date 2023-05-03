package main;

import classes.PensionFund;
import classes.Person;

import java.lang.annotation.Annotation;

public class MainReflectionSecond {

    public static void main(String[] args) {
        //Person person = new Person();
        //Class cls1 = person.getClass();

        Class cls = PensionFund.class;
        Annotation[] annotations = cls.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            if (annotation.annotationType().getName().equals("classes.JavaMages")) {
                System.out.println("Этим классом будет управлять наш фреймворк JavaMages43e");
            }
        }

        //Нужно сделать 2 аннотации:
        //Название выбираете самостоятельно
        //Одна аннотация:
        //Два поля - строка и число. Ее необходимо вызввать на одном из классов, передав в нее параметры
        //Вторая аннотация без параметров. Ее также необходимо вызвать на одном из классов.

    }
}
