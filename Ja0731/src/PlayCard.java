
public interface PlayCard {
	public static final int number = 1;		// 상수만 가능
	String kind = "";
	public abstract void play();		// 추상메서드만 가능
	void stop();
	
}
