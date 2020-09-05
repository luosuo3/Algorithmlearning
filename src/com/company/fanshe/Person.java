package com.company.fanshe;

import java.time.Period;

/**
 * @author 王峥
 * @date 2020/9/3 6:10 下午
 */
public class Person {
    String name;
    int age;
    Person( int age ,String name) {
        this.age = age;
        this.name = name;
    }
    public void publicPerson() {
        System.out.println("公共"+this.age+this.name);
    }
    private void privatePerson() {
        System.out.println("私有"+this.age+this.name);
    }
}

