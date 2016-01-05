package ie.gmit.sw.paint;

public class Values {
	
	private int min;
	private int max;
	private int mid;
	private int qtr;
	private int qte;
	
	
	public Values(int min, int max, int mid, int qtr, int qte) {
		super();
		this.min = min;
		this.max = max;
		this.mid = mid;
		this.qtr = qtr;
		this.qte = qte;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public int getMax() {
		return max;
	}


	public void setMax(int max) {
		this.max = max;
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		
		this.mid = mid;
	}


	public int getQtr() {
		return qtr;
	}


	public void setQtr(int qtr) {
		this.qtr = qtr;
	}


	public int getQte() {
		return qte;
	}


	public void setQte(int qte) {
		this.qte = qte;
	}
	
	public int calcMid(){
		mid = max/2;
		return mid;
	}
	
	public int calcQtr(){
		qtr = mid/2;
		return qtr;
	}
	
	public int calcQte(){
		
		qte = mid + qtr;
		return qte;
	}
	
	
	
	
	
	
	
	

}
