package com.multi.spring.model.dto;

public class MapDTO {

	private double lat;
	private double lon;
	private String location;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	@Override
	public String toString() {
		return "MapVO [lat=" + lat + ", lon=" + lon + "]";
	}
}