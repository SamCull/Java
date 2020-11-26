package week6.lab2;

public class Hgv extends RoadVehicle{ //is a RoadVehicle
	private int cargo;

	public Hgv(){ 	
		this(0,0,0);	
	}

	public Hgv(int c, int w, int p){ 
		super(w, p);
		setCargo(c);
	}

	public void setCargo(int size){
		cargo = size;
		}

	public int getCargo(){
		return cargo;
		}

	//toString
	@Override
	public String toString() {
		return "Hgv [cargo=" + cargo + " " + super.toString() + "]";
	}	
	
	
}