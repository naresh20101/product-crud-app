package prouductcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import prouductcrudapp.model.Product;

@Component
public class ProductDao {
	@Autowired
  private HibernateTemplate hibernateTemplate;
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	public List<Product> getProducts()
	{
		List<Product> products=this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	@Transactional
	public void delete(int pId)
	{
		Product p=this.hibernateTemplate.load(Product.class, pId);
		this.hibernateTemplate.delete(p);
	}
	public Product getProduct(int pId)
	{
		return this.hibernateTemplate.get(Product.class, pId);
	}
}
