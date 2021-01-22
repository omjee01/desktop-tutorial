
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author avinash.k
 */

interface A{
    void method1();
}
class One implements A{
    
    @Override
    public void method1() {
        System.out.println("One.method1()");
    }
}

class Two extends One{
    public void method1() {
        System.out.println("Two.method1()");
    }
}

public class Test extends Two{
    
    public static void main(String avi[]){
       A a = new Two();
       a.method1();
       
       
    }
}
