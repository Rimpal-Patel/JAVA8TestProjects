interface inter
{
    void add(int a, int b);
}
public class FunctionalInterfaceUsingLamda  {

    public static void main(String[] args) {
        inter i = (a,b)-> System.out.println(" the sum is=>"+(a+b));
        i.add(100,200);
    }



}
