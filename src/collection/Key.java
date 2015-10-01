package collection;

public class Key {
	private Object key1;
	private Object key2;

	public Key() {
	}
	
    public Key(Object k1, Object k2) {
        this.key1 = k1;
        this.key2 = k2;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Key)) return false;
        Key key = (Key) obj;
        return key1 == key.key1 && key2 == key.key2;
    }
    
    @Override
    public int hashCode() {
        return key1.hashCode() ^ key2.hashCode();
    }
}
