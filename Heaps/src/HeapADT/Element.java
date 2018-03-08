package heapADT;

/**
 * Integer object that stores a single interger
 * like a wrapper
 * @author Beesham Sarendranauth
 */
public class Element{
	Integer i;

	public Element(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Element{" +
				"i=" + i +
				'}';
	}
}
