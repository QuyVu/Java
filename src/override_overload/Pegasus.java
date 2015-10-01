package override_overload;

public class Pegasus extends Horse implements Flyer, Mythical {
	
	public String identifyMyself() {
		return Flyer.super.identifyMyself();
    }
    
    public static void main(String... args) {
    	String s = "rainbow";
    	int i = 3;
        Pegasus myPet = new Pegasus();
        myPet.paint();
        myPet.paint(s);
        myPet.paint(s, i);
        System.out.println(myPet.identifyMyself());
    }
}
