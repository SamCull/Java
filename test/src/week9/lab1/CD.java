package week9.lab1;

public class CD extends LibraryItem {
	
	//Variables
	String band;
	String title;
	int numTracks;
	
	//Constructors
		public CD(String band, String title, int numTracks) {
		super();
		setBand(band);
		setTitle(title);
		setNumTracks(numTracks);
	}
	
	//Getters & Setters
	
	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumTracks() {
		return numTracks;
	}
	public void setNumTracks(int numTracks) {
		this.numTracks = numTracks;
	}
	
	//Overridden Getters & Setters
	@Override
	public double calculatePrice() {
		return 2.0;
	}

	//toString
	@Override
	public String toString() {
		return "CD [band=" + band + ", title=" + title + ", numTracks=" + numTracks + ", calculatePrice()="
				+ calculatePrice() + "]";
	}

	
	
	

}
