package innerclass;
public class MyClass{
    public void myShow(){
      
        Outer.Inner in = new Outer().new Inner();  
        System.out.print("MyClass call Inner : ");
        in.innerShow();
    }
}
