package deel4.domain;

public class DiagonaleBaan implements IBaan {
	private boolean naarRechts;
	private boolean naarOnder;
	private int x;
	private int y;
	
	public DiagonaleBaan(int x, int y){
		this.x = x;
		this.y = y;
		naarRechts = true;
		naarOnder = true;
	}
	
	@Override
	public int getY() {
		if (naarOnder) y = y+2; else y = y -2;
		return y;
	}

	
	@Override
	public int getX() {
		if (naarRechts) x = x+2; else x = x -2;
		return x;
	}

	@Override
	public void veranderRichtingSides() {
		naarRechts = !naarRechts;	
		
	}

	@Override
	public void veranderRichtingTop() {
		naarOnder = !naarOnder;	
		
	}
}
