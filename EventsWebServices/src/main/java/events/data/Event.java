package events.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

public class Event {

	@Id private String id;
	
	private String title;
	private String description;
	private String imageURL;
	private double latitude;
	private double longitude;
	private String addedByName; //links to name in user table 
	private Date eventStartDateTime;
	private Date eventEndDateTime;
	private Date addedOn;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getAddedByName() {
		return addedByName;
	}
	public void setAddedByName(String addedByName) {
		this.addedByName = addedByName;
	}
	public Date getEventStartDateTime() {
		return eventStartDateTime;
	}
	public void setEventStartDateTime(Date eventStartDateTime) {
		this.eventStartDateTime = eventStartDateTime;
	}
	public Date getEventEndDateTime() {
		return eventEndDateTime;
	}
	public void setEventEndDateTime(Date eventEndDateTime) {
		this.eventEndDateTime = eventEndDateTime;
	}
	public Date getAddedOn() {
		return addedOn;
	}
	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

}
