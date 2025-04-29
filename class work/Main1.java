class Hello
{
    int a=10;
    int b=20;
    void sum(){
        int result=a+b;
        System.out.println(result);
    }
}
class Hi extends Hello
{
    int c=30;
    void mul()
    {
        int result=a*b*c;
        System.out.println(result);
    }
}
class Demo extends Hi{
    int d=40;
}
public class Main1{
    public static void main(String[] args){
        // Hi h1=new Hi();
        // h1.sum();
        // System.out.println(h1.a);
        // h1.mul();
        Hi h1=new Hi();
        Demo d1=new Demo();
        h1.sum();
        d1.sum();
        
    }
}