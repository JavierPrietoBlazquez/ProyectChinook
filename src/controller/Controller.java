package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.AyudanteBD;
import view.vDiscs;
import view.vArtistAdd;
import view.vArtistSearch;
import view.vAlbumAdd;
import view.vAlbumSearch;
import view.vSongsAdd;
import view.vSongsMod;

/**
 * @author Javier Prieto Blázquez
 *
 */
public class Controller {
	
	private	vDiscs disc;
	private	vArtistAdd artA;
	private	vArtistSearch artS;
	private	vAlbumAdd albA;
	private	vAlbumSearch albS;
	private	vSongsAdd songA;
	private vSongsMod songM;
	private AyudanteBD ayudanteBD;

	
	public Controller(){
		ayudanteBD = new AyudanteBD();
	}
	
	
	
//	public void abrirArtistasAñadir(){
//		artA.frmArtistaAadir.setVisible(true);
//	}
//	public void abrirArtistasBuscar(){
//		artS.frmArtistasBuscar.setVisible(true);
//	}
//	public void abrirAlbumesAñadir(){
//		albA.frmAlbumesAadir.setVisible(true);
//	}
//	public void abrirAlbumesBuscar(){
//		albS.frmAlbumesBuscar.setVisible(true);
//	}
	
	
	
	
	
	public static void main(String[] args) {
		new Controller();
		
	}
	
	
	
}
