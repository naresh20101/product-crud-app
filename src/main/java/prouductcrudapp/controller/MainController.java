package prouductcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import prouductcrudapp.dao.ProductDao;
import prouductcrudapp.model.Product;

@Controller
public class MainController {
	@Autowired
	private ProductDao productDao;
	@RequestMapping("/")
	public String home(Model m)
	{ 
		List<Product> products=productDao.getProducts();
		m.addAttribute("products", products);
		
		
		return"home";
	}
	@RequestMapping("/add-product")
  public String addProduct()
  {
	  return "add_product_form";
  }
	@RequestMapping(value="/handle-product", method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest request)
	{
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
}
