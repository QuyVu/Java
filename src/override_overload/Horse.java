package override_overload;

public class Horse {

    public String identifyMyself() {
        return "I am a horse.";
    }

    //Overload method paint
    public void paint(){
    	System.out.println("This one is blue");
    }
    
    public void paint(String s) {
    	System.out.println("This one is " + s);
    }
    
    public void paint(String s, int i) {
    	System.out.println("This one is " + s + " and have " + i + " horns");
    }
}
