package override_overload;

public interface Flyer {

    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
