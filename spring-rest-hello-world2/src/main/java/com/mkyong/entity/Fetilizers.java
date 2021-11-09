package com.mkyong.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "fetilizers")
public class Fetilizers {
	@Id
	private int id;
	public Fetilizers(int id, String name, int price, String[] tags, boolean favorite, double stars, String imageUrl,
			String[] origins, String cookTime) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.tags = tags;
		this.favorite = favorite;
		this.stars = stars;
		this.imageUrl = imageUrl;
		this.origins = origins;
		this.cookTime = cookTime;
	}
	public Fetilizers(){
		
	}
	private String name;
	   private int price;
	  private String[] tags;
	  private  boolean favorite  = false;
	   private double stars= 0;
	  private String imageUrl;
	   private String[] origins;
	   private String cookTime;
   public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public boolean isFavorite() {
		return favorite;
	}
	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}
	public Double getStars() {
		return stars;
	}
	public void setStars(double stars) {
		this.stars = stars;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String[] getOrigins() {
		return origins;
	}
	public void setOrigins(String[] origins) {
		this.origins = origins;
	}
	public String getCookTime() {
		return cookTime;
	}
	public void setCookTime(String cookTime) {
		this.cookTime = cookTime;
	}

}
