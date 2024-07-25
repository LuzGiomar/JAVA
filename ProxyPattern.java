package br.com.luzaraldi;
//luzaraldi.medium.com

public class ProxyPattern {

    public static void main(String[] args) {
        System.out.println();
        new client().greet("LuzAraldi");
        }

interfaceSubctInterface {
    String greet(String name);
}

class RealSubject implements SubjectInterface {

    @Override
    public String greet(String name) {
       return ("Hello, " + name + "!");

    }
}

class RealSubjectProxy implements SubjectInterface {
    private SubjectInterface realsubject = new Realsubject();

    @Override
    public String greet(String );
    System.out.println("Proxy: Loggin before gretting...");
    String result = realSubject.greet(name);
    System.out.println("Proxy: Loggin after gretting...");

    return result;
}

Class Client {
    public String greet(String name) {
        var realSubjectProxy = new RealSubtProxi();

        return realSubjectProxy.greet(name);
        
    }
}

