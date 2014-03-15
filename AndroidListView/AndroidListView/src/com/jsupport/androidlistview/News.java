package com.jsupport.androidlistview;

public class News {
	
	public News(int image, String name, String description){
		this.imageNumber=image;
		this.name=name;
		this.itemDescription=description;
	}
	public News() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public int getImageNumber() {
		return imageNumber;
	}
	public void setImageNumber(int imageNumber) {
		this.imageNumber = imageNumber;
	}
	
	private String name ;
	private String itemDescription;
	private int imageNumber;

	
}
