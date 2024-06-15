package com.harish.rentify.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue
	private int id;
	private String location;
    private String size;
    private String layout;
    private String outdoorSpace;
    private String views;
    private String parking;
    private String amenities;
    private String schoolDistrict;
    private String safetyAndSecurity;
    private String energyEfficiency;
    private String hoa;
	public Property(int id, String location, String size, String layout, String outdoorSpace, String views,
			String parking, String amenities, String schoolDistrict, String safetyAndSecurity, String energyEfficiency,
			String hoa) {
		super();
		this.id = id;
		this.location = location;
		this.size = size;
		this.layout = layout;
		this.outdoorSpace = outdoorSpace;
		this.views = views;
		this.parking = parking;
		this.amenities = amenities;
		this.schoolDistrict = schoolDistrict;
		this.safetyAndSecurity = safetyAndSecurity;
		this.energyEfficiency = energyEfficiency;
		this.hoa = hoa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getLayout() {
		return layout;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public String getOutdoorSpace() {
		return outdoorSpace;
	}
	public void setOutdoorSpace(String outdoorSpace) {
		this.outdoorSpace = outdoorSpace;
	}
	public String getViews() {
		return views;
	}
	public void setViews(String views) {
		this.views = views;
	}
	public String getParking() {
		return parking;
	}
	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public String getSchoolDistrict() {
		return schoolDistrict;
	}
	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}
	public String getSafetyAndSecurity() {
		return safetyAndSecurity;
	}
	public void setSafetyAndSecurity(String safetyAndSecurity) {
		this.safetyAndSecurity = safetyAndSecurity;
	}
	public String getEnergyEfficiency() {
		return energyEfficiency;
	}
	public void setEnergyEfficiency(String energyEfficiency) {
		this.energyEfficiency = energyEfficiency;
	}
	public String getHoa() {
		return hoa;
	}
	public void setHoa(String hoa) {
		this.hoa = hoa;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", location=" + location + ", size=" + size + ", layout=" + layout
				+ ", outdoorSpace=" + outdoorSpace + ", views=" + views + ", parking=" + parking + ", amenities="
				+ amenities + ", schoolDistrict=" + schoolDistrict + ", safetyAndSecurity=" + safetyAndSecurity
				+ ", energyEfficiency=" + energyEfficiency + ", hoa=" + hoa + "]";
	}
	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    


}
