package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProdouctDao;
import productcrudapp.model.Product;

@Controller
public class MainController {

	@Autowired
	private ProdouctDao prodouctDao;

	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = prodouctDao.getProduct();
		m.addAttribute("products", products);
		return "index";
	}

	// show add product form
	@RequestMapping("/add_product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}

	// handle add product form
	@RequestMapping(value = "/handle_product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		System.out.println(product);
		prodouctDao.createProduct(product); // save data in database
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");// getContextPath() --> project name return mate use thse
		return redirectView;

	}

	// delete handler
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId, HttpServletRequest request) {
		this.prodouctDao.deleteProduct(productId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");// getContextPath() --> project name return mate use thse
		return redirectView;

	}

	@RequestMapping("/update/{productId}") // productId template uri variable
	public String updateProduct(@PathVariable("productId") int productId, Model m) {
		Product product = this.prodouctDao.getProduct(productId);
		m.addAttribute("product", product);
		return "update_form";

	}

}
