/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;
import java.util.LinkedList;
/**
 *
 * @author cadelmonterde
 */
public class MyListTest
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MyList list = new MyList();
        list.myPush(3);
        list.myPush(6);
        list.myPush(7);
        list.myInjection(42);
        System.out.print(list.myPop());
    }

    
}
class MyList<AnyType>
{
    LinkedList<AnyType> list; 
    public MyList()
    {
        list = new LinkedList<>();
    }
    public void myPush(AnyType x)
    {
        list.add(x);
    }
    public AnyType myPop()
    {
        AnyType hold = list.remove();
        return hold;
    }
    public void myInjection(AnyType x)
    {
        list.addFirst(x);
    }

}
