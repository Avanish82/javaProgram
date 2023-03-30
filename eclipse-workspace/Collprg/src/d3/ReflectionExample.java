package d3;

import java.lang.reflect.*;
import java.lang.annotation.*;

 

public class ReflectionExample {
    public static void main(String[] args) {

 

        Class aClass = MyObject.class;
        String className = aClass.getName();
        System.out.println("ClassName: " + className);

 

        String simpleClassName = aClass.getSimpleName();
        System.out.println("SimpleClassName: " + simpleClassName);

 

        int modifiers = aClass.getModifiers();
        System.out.println("Modifiers: " + modifiers);

 

        /*
         * The modifiers are packed into an int where each modifier is a flag
         * bit that is either set or cleared. You can check the modifiers using
         * these methods in the class java.lang.reflect.Modifier:
         * 
         * Modifier.isAbstract(int modifiers) Modifier.isFinal(int modifiers)
         * Modifier.isInterface(int modifiers) Modifier.isNative(int modifiers)
         * Modifier.isPrivate(int modifiers) Modifier.isProtected(int modifiers)
         * Modifier.isPublic(int modifiers) Modifier.isStatic(int modifiers)
         * Modifier.isStrict(int modifiers) Modifier.isSynchronized(int
         * modifiers) 
         * Modifier.isTransient(int modifiers)
         * Modifier.isVolatile(int modifiers)
         */

 

        // Package package = aClass.getPackage();//package info
        // System.out.println("Package : "+package);

 

        Class superclass = aClass.getSuperclass();
        String superclassName = superclass.getName();
        System.out.println("Super ClassName: " + superclassName);

 

        Class[] interfaces = aClass.getInterfaces();
        if (interfaces.length != 0) {
            String superInterfaceName = (interfaces[0]).getName();
            System.out.println("Super Interface Name: " + superInterfaceName);
        }

 

        Constructor[] constructors = aClass.getConstructors();
        if (constructors.length != 0) {
            String constructorsName = (constructors[0]).getName();
            System.out.println("constructors Name: " + constructorsName);

 

            Class[] parameterTypes = (constructors[0]).getParameterTypes();
            if (parameterTypes.length != 0) {
                String parameterTypesName = (parameterTypes[0]).getName();
                System.out
                        .println("parameterTypes Name: " + parameterTypesName);
            }
        }

 

        Field[] fields = aClass.getFields();
        if (fields.length != 0) {
            String fieldsName = (fields[0]).getName();
            Object fieldType = (fields[0]).getType();
            System.out.println("fields Name: " + fieldsName + "  fieldType : "
                    + fieldType);
        }
        

 

        Method[] methods = MyObject.class.getMethods();
        for (Method method : methods) {
            System.out.println("method = " + method.getName());
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes)
                System.out
                        .println("parameterType = " + parameterType.getName());
            Class returnType = method.getReturnType();
            System.out.println("returnType = " + returnType.getName());

 

        }


        MyObject obj = new MyObject();
        try {
            obj.getClass().getMethod("doSomething").invoke(obj);
        } catch (Exception e) {
            System.out.println("oh no!");
        }


    }
}

class MyObject {
    public int a;

    public MyObject() {
    }

    public MyObject(int x) {
        a = x;
    }

    public void method1() {
    }

    public void doSomething() {
        System.out.println("Hellos");
    }

    public void method2(int x, int y) {
        System.out.println(x + y);
    }
}
 