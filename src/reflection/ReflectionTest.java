package reflection;

import java.lang.reflect.*;

public class ReflectionTest {

    public static Object function1(){
        return new String();
    }
    public static void main(String[] args) {

        Object obj = function1();
        Class <?> objClass = obj.getClass();
        for(Method m : objClass.getMethods()){
            System.out.println("-------------------------");
            System.out.println(m.getName());
            System.out.println(m.getReturnType());
            for(Parameter p : m.getParameters()){
                System.out.printf("\t %s [%s]\n", p.getName(), p.getType());
            }
        }
    }
}
