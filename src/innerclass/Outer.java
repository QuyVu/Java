package innerclass;
public class Outer{
    public void outerShow(){
        Inner inner = new Inner();
        inner.innerShow();
    }
    class Inner{
        public void innerShow(){
            System.out.println("This is Inner class.");
        }
    }
}
