/**
 * 
 */
package tp2;

/**
 * @author Florence
 *
 */
public class IP {
	
	private int oct1;
	private int oct2;
	private int oct3;
	private int oct4;
	
	/**
	 * Constructeur 
	 * @param oct1
	 * @param oct2
	 * @param oct3
	 * @param oct4
	 */
	public IP (int oct1, int oct2, int oct3, int oct4){
		this.oct1 = oct1;
		this.oct2 = oct2;
		this.oct3 = oct3;
		this.oct4 = oct4;
	}

	public int getOct1() {
		return oct1;
	}

	public void setOct1(int oct1) {
		this.oct1 = oct1;
	}

	public int getOct2() {
		return oct2;
	}

	public void setOct2(int oct2) {
		this.oct2 = oct2;
	}

	public int getOct3() {
		return oct3;
	}

	public void setOct3(int oct3) {
		this.oct3 = oct3;
	}

	public int getOct4() {
		return oct4;
	}

	public void setOct4(int oct4) {
		this.oct4 = oct4;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IP IPv4 = new IP(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
	}

}
