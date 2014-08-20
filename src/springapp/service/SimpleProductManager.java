package springapp.service;

import java.util.List;

import springapp.domain.Product;

public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;

	private List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public void increasePrice(int percentage) {
		// TODO Auto-generated method stub
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
