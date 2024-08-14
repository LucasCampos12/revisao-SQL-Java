package entities;

public class Product {

	private Long id;
	private String name, description, imageURL;
	private Double price;

	public Product() {

	}

	public Product(Long id, String name, String description, String imageURL, Double price) {

		this.id = id;
		this.name = name;
		this.description = description;
		this.imageURL = imageURL;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", imageURL=" + imageURL
				+ ", price=" + price + "]";
	}
	
	

}
