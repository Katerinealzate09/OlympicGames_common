package co.com.udem.OlympicGames.model;

import java.io.Serializable;

public class HomeDTO implements Serializable{

	private static final long serialVersionUID = -2549040187834278664L;
	private String title;
	private String image;
	private String url;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public HomeDTO(String title, String image, String url) {
		super();
		this.title = title;
		this.image = image;
		this.url = url;
	}
	
}
