package model;

import java.sql.Blob;

/**
 * @author Javier Prieto Blázquez
 *
 */
public class mArtistVO {
	private String name;
	private Blob image;	
	
	
	public String getNombre() {
		return name;
	}
	public void setNombre(String name) {
		this.name = name;
	}
	public Blob getImagen() {
		return image;
	}
	public void setImagen(Blob image) {
		this.image = image;
	}
}
