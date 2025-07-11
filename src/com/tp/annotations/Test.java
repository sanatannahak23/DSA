package com.tp.annotations;

import java.lang.reflect.Method;
import java.util.jar.JarOutputStream;

public class Test {
}

class Employee {

    @MyAnnot(name = "Employee", value = 55.5)
    public void normal() {
        Class<Employee> clazz = Employee.class;

        Method[] methods = clazz.getMethods();

        MyAnnot annotation = methods[0].getAnnotation(MyAnnot.class);
        System.out.println(annotation.name() + "  and " + annotation.value());
    }
}
