package co.com.udem.OlympicGames.model;

import java.io.Serializable;

public class MedalDTO implements Serializable{

	private static final long serialVersionUID = -2759835688586358567L;
	private String name;
	private String nationality;
	private String image;
	private String medal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getMedal() {
		return medal;
	}
	public void setMedal(String medal) {
		this.medal = medal;
	}
	public MedalDTO(String name, String nationality, String image, String medal) {
		super();
		this.name = name;
		this.nationality = nationality;
		this.image = image;
		this.medal = medal;
	}
	
}
