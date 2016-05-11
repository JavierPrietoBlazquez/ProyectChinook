package model;

import java.sql.Blob;

/**
 * @author Javier Prieto Blázquez
 *
 * CRUD Metods (Create, Read, Update & Delete)
 * of the object Artist
 */

//Model Interface
public interface miArtistDAO {
	/** 
	 * Queremos añadir artistas (nombre), modificar su foto (modificar-eliminar) 
	 * y modificar-eliminar su nombre.
	 */
	
	public void insert(mArtistVO artist);
	public void deleteByName(String name);
	public void updateByName(String name);
	public mArtistVO findByName(String name);
	
	public void updateImage(Blob image);
	public void deleteImage(Blob image);
	
	//public void update(mArtistVO artist);
}