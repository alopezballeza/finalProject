package com.hcc.advweb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="trips")
public class TripsParameters {
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="YEAR")
	private int year;
	@Column(name="MONTH")
	private String month;
	@Column(name="COUNTRY")
	private String country;
	@Column(name="CITY")
	private String city;
	@Column(name="CONTINENT")
	private String continent;
	@Column(name="WEATHER")
	private String weather;
	@Column(name="COMMENTS")
	private String comments;
	
	public TripsParameters(int id, int year, String month, String country, String city, String continent, String weather, String comments) {
		setId(id);
		setYear(year);
		setMonth(month);
		setCountry(country);
		setCity(city);
		setContinent(continent);
		setWeather(weather);
		setComments(comments);
	}
	
	@Override
	public String toString() {
		return "Tip [id=" + id + ", year=" + year + ", month=" + month + ", country=" + country + ", city="
				+ city + ", continent=" + continent + ", weather=" + weather + ", comments=" + comments + ", getId()=" + getId() + ", getYear()=" + getYear() + ", getMonth()="
				+ getMonth() + ", getCountry()=" + getCountry() + ", getCity()=" + getCity() + ", getContinent()="
				+ getContinent() + ", getWeather()=" + getWeather() + ", getComments()=" + getComments() + "]";
	}
	
	public TripsParameters() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	


}
