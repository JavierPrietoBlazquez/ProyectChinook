package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AyudanteBD extends Conexion {

	private static final String INSERT_ARTIST = "INSERT INTO artist (ArtistId, name) VALUES (?,?)";
	private static final String DELETE_ARTIST = "DELETE FROM  artist WHERE ArtistId= ?";
	private static final String ID_LAST_ARTIST = "SELECT MAX(ArtistId)  FROM artist";
	private static final String QUERY_ARTIST = "SELECT ArtistId FROM  artist WHERE name= ?";

	public AyudanteBD() {

	}

	public AyudanteBD(String nombreBBDD, String usuario, String contraseña) {
		super(nombreBBDD, usuario, contraseña);

	}

	/**
	 * Method that insert a object artist into the database
	 * 
	 * @param artist
	 * @return true if the insert was succesfull, false in the contrary
	 */
	public int saveArtist(Artist artist) {
		int id = 0;
		if (!artistExist(artist)) {
			try (PreparedStatement st = getConexion().prepareStatement(INSERT_ARTIST)) {
				id = getNextIdFromArtist();
				st.setInt(1, id);
				st.setString(2, artist.getName());
				st.executeUpdate();
			} catch (SQLException e) {
				System.err.println(e.getMessage());
				id = 0;
			}

		}
		return id;

	}

	private boolean artistExist(Artist artist) {
		
		return queryArtist(artist) != 0;
	}

	public int queryArtist(Artist artist) {
		int id = 0;
		try (PreparedStatement st = getConexion().prepareStatement(QUERY_ARTIST)) {
			st.setString(1, artist.getName());
			try (ResultSet resultSet = st.executeQuery()) {
				if (resultSet.next())
					id = resultSet.getInt(1);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			id = 0;
		}

		return id;

	}

	public boolean deleteArtist(Artist artist) {

		try (PreparedStatement st = getConexion().prepareStatement(DELETE_ARTIST)) {
			st.setInt(1, artist.getArtistId());
			st.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return false;
		}

		return true;

	}

	public int getNextIdFromArtist() {
		int id = 0;
		try (Statement st = getConexion().createStatement()) {
			try (ResultSet resultSet = st.executeQuery(ID_LAST_ARTIST)) {
				resultSet.next();
				id = resultSet.getInt(1) + 1;
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			return -1;
		}
		return id;
	}
}
