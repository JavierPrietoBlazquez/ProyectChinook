package model;

/**
 * @author Javier Prieto Blázquez
 *
 */
public class mSongVO {
	private String name;
	private String media; //filename extension
	private String genre;
	private String composer; 
	private int milliseconds;
	private int bytes;
	private double unitPrice;
	
	public String getNombre() {
		return name;
	}
	public void setNombre(String name) {
		this.name = name;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getMilliseconds() {
		return milliseconds;
	}
	public void setMilliseconds(int milliseconds) {
		this.milliseconds = milliseconds;
	}
	public int getBytes() {
		return bytes;
	}
	public void setBytes(int bytes) {
		this.bytes = bytes;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
}
