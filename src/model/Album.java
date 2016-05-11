package model;

import java.io.Serializable;

public class Album implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private int fkArtistArtistId;
	
	
	public Album() {
		super();
	}
	public Album(int id, String title, int fkArtistArtistId) {
		super();
		this.id = id;
		this.title = title;
		this.fkArtistArtistId = fkArtistArtistId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getFkArtistArtistId() {
		return fkArtistArtistId;
	}
	public void setFkArtistArtistId(int fkArtistArtistId) {
		this.fkArtistArtistId = fkArtistArtistId;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (fkArtistArtistId != other.fkArtistArtistId)
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", fkArtistArtistId=" + fkArtistArtistId + "]";
	}



}
