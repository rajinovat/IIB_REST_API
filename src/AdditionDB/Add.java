
import java.util.concurrent.atomic.AtomicInteger;

public class Add {
	private static AtomicInteger currentID = new AtomicInteger(1);

	private int id;
	private int i;
	private int j;
	private int k;
	
	public Add(int i, int j, int k) {
		id = currentID.getAndIncrement();
		this.i = i;
		this.j = j;
		this.k = i+j;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	
	

	
	


}
