package br.com.luzaraldi;
//luzaraldi.medium.com/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy {

    public static void main(String[] args) {
        
    }
}

interface GreetingService {
    String greet(String name); 
}

class EnglishGreetingService implements GreetingService {

   @Override
   public String greet(String name) {
 
      return "Hello, " + name + "!";

   }

}

class LogginInvocationHandler implements InvocationHandler {
  private final Object target;

  public LoggingInvocationHandler(Object taget) {
    this.taget = target;
  }

}



    @Override
    public Object invoke()
       System.out.println("Methon " + method.getName() + "is called with arguments + (
       args != null ? Arrays.toString(args) : "null"
       ));
       Object result = method.invoke(target, args);
       System.out.println(
       "Method " + method.getName() + " return " + result;
       );
       return result; 

}

class proxyFactoryJDK {
    public static <T> T createProxy(T target, Class<T> interfaceType) {
        return (T) Proxy.newProxyInstance(
            interfaceType.getClasssLoader(),
            new Class<?>[] (interfaceType),
            new LogginInvocationHandler(target));
        
    } 
}