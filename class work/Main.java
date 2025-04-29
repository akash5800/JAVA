// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class hello{
    int a=10;
    int b=20;
    hello()
    {
        System.out.println("this is constructor without parameter");
    }
    hello(int n){
        System.out.println("this is constructor");
    }
    void sum(){
        int result=a+b;
        System.out.println(result);
    }
    void sum(int n){
        int c=n;
        int result=a+b+c;
        System.out.println(result);
    }
}
public class Main {
    public static void main(String[] args) {
        hello h1=new hello(10);
        hello h2=new hello();
        h1.sum();
        h2.sum();
        System.out.println(h1.a);
    }
}