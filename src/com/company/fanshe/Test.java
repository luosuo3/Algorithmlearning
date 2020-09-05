package com.company.fanshe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 王峥
 * @date 2020/9/3 6:19 下午
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person(22, "王峥");
        Class<? extends Person> personClass = person.getClass();
        Field[] declaredFields = personClass.getDeclaredFields();
        Field[] fields = personClass.getFields();
        Method[] methods = personClass.getMethods();
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Field declaredField : declaredFields) {
            System.out.println("成员变量"+declaredField);
        }
        for (Field field : fields) {
            System.out.println("私有变量"+field);
        }
        for (Method method : methods) {
            System.out.println("公共方法"+method);
        }
        for (Method declaredMethod : declaredMethods) {
            System.out.println("声明方法"+declaredMethod);
        }

    }
}
