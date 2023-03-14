package productcrudapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import productcrudapp.model.Product;

@Component
public class ProdouctDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	// create or update
	@Transactional
	public void createProduct(Product product) {
		hibernateTemplate.saveOrUpdate(product);
	}
	
	//get all products
	public List<Product> getProduct(){
		List<Product> products =this.hibernateTemplate.loadAll(Product.class);
		return products;
		
	}

	//delete single product
	@Transactional
	public void deleteProduct(int pid) {
	Product p=	this.hibernateTemplate.load(Product.class, pid);
	this.hibernateTemplate.delete(p);
		
		
	}
	//get the single product
	public Product getProduct(int pid) {
		Product p = this.hibernateTemplate.get(Product.class, pid);
		return p;
		
	}
	//update product
//	public Product updateProduct(int pid) {
//		Product p = this.hibernateTemplate.get(Product.class, pid);
//		this.hibernateTemplate.update(p.getName());
//		
//		
//	}
}
