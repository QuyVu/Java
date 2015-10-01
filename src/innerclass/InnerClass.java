package innerclass;
public class InnerClass{
    public static void main(String [] args){
        Outer out = new Outer();
        out.outerShow();
         
        MyClass myOut = new MyClass();
        myOut.myShow();
    }
}
