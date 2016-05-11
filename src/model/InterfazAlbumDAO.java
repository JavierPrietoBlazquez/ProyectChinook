package model;

/**
 * @author Javier Prieto Bl�zquez
 *
 * CRUD Metods (Create, Read, Update & Delete)
 * of the object Album
 */

//Model Interface
public interface InterfazAlbumDAO {
	//A�adir, modificar y eliminar album (de un artista)  
	
	public void insert(mAlbumVO album);
	public void updateByName(String name);
	public void deleteByName(String name);	
	
}
