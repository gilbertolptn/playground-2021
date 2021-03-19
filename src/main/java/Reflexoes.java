import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexoes {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Reflexoes reflexoes = new Reflexoes();
        Method[] methods = reflexoes.getClass().getMethods();

        for (Method method : methods){
            method.invoke(reflexoes);
        }
    }

    public void teste(){
        System.out.println("a");
    }
    public void teste1(){
        System.out.println("b");
    }

}
