public class SwappableInt {
	
	private int value;
	
    public SwappableInt () {
        this.value = 0;
    }
    
	public SwappableInt(int value) {
		this.value = value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

}