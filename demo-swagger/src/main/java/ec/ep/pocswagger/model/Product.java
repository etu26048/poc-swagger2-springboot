package ec.ep.pocswagger.model;

import io.swagger.annotations.ApiModelProperty;

public class Product {

	@ApiModelProperty(notes = "The database generated product ID")
	private Integer id;
	@ApiModelProperty(notes = "The product description")
	private String description;
	@ApiModelProperty(notes = "The image URL of the product")
	private String imageUrl;
	@ApiModelProperty(notes = "The price of the product", required = true)
	private Double price;

	public Product() {
	}

	public Product(String description, String imageUrl, Double price) {
		super();
		this.description = description;
		this.imageUrl = imageUrl;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
