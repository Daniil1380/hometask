package main;

import classes.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MainReflection {

    public static void main(String[] args) throws NoSuchMethodException {
        Person person = new Person();
        Class cls = person.getClass();

        System.out.println(cls.getName());

        Constructor[] constructors = cls.getConstructors();

        System.out.println(Arrays.toString(constructors));

        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        System.out.println("111111111");
        Method setMethod = cls.getMethod("setYears", int.class);
        System.out.println(setMethod);
        setMethod.invoke();

    }
}
