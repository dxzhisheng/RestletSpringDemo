package com.eddiesheffield.restlet.server.data;

public class User {
	
	private String name;
	private int age;
	private String favoriteFood;
	private String apiKey;
	private int id;

	public User(int id, String name, int age, String favoriteFood) {
		this(id, name, age, favoriteFood, null);
	}

	public User(int id, String name, int age, String favoriteFood, String apiKey) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.favoriteFood = favoriteFood;
		this.apiKey = apiKey;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public String getApiKey() {
		return apiKey;
	}
}
