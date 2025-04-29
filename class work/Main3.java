interface Hello{
    int a=10;
    int b=20;
    void sum();

}
class Demo implements Hello
{
    int c=30;
    public void sum()
    {
        int result=a+b+c;
        System.out.println(result);
    }
}
public class Main3
{
    public static void main(String[]args){
    Demo d1=new Demo();
    d1.sum();
    }
    
}