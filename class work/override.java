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
    void sum()
    {
        int result=a+b+c;
        System.out.println(result);
    }
}
 
public class override{
    public static void main(String[] args){
         
        //Hi h1=new Hi();
        Hello h1=new Hi();  // method overriding concept
        h1.sum();
        System.out.println(h1.a);
        
    }
}