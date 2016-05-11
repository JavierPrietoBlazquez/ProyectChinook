package model;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.SQLException;
import java.sql.Statement;

public class Artist implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int artistId;
	private String name;
	
	
	public Artist() {
		super();
	}
	public Artist(int artistId, String name) {
		super();
		this.artistId = artistId;
		this.name = name;
	}
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	


	
}
