import static org.junit.Assert.*;

import org.junit.Test;

import model.Artist;
import model.AyudanteBD;

public class TestModelo {

	@Test
	public void testgetNextIdFromArtist() {
		// ahora está por 275
		AyudanteBD ayudante= new AyudanteBD();
		assertNotEquals(1, ayudante.getNextIdFromArtist());
		
	}
	
	@Test
	public void testSaveArtist() {
		AyudanteBD ayudante= new AyudanteBD();
		Artist artist = new Artist(0,"Paco de Lucia");
		int id = 0;
		assertNotEquals(0,id = ayudante.saveArtist(artist));
		assertEquals(0,id = ayudante.saveArtist(artist));
		artist.setArtistId(id);
		ayudante.deleteArtist(artist);
		
	}
	
	
	@Test
	public void testQueryArtist() {
		AyudanteBD ayudante= new AyudanteBD();
		Artist artist = new Artist(0,"AC/DC");
		assertEquals(1,ayudante.queryArtist(artist));
		
		
	}
	
	

}
