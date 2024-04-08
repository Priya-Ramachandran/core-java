package Class;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
public class Demo {
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer cust1 = new Customer(1l, "Stefan Walker", 1);
		Customer cust2 = new Customer(2l, "Daija Von", 1);
		Customer cust3 = new Customer(3l, "Ariane Rodriguez", 1);
		Customer cust4 = new Customer(4l, "Marques Nikolaus", 2);
		Customer cust5 = new Customer(5l, "Rachelle Greenfelder", 0);
		Customer cust6 = new Customer(6l, "Larissa White", 2);
		Customer cust7 = new Customer(7l, "Fae Heidenreich", 1);
		Customer cust8 = new Customer(8l, "Dino Will", 2);
		Customer cust9 = new Customer(9l, "Eloy Stroman", 1);
		Customer cust10 = new Customer(10l, "Brisa O'Connell", 1);
		
		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
		customers.add(cust4);
		customers.add(cust5);
		customers.add(cust6);
		customers.add(cust7);
		customers.add(cust8);
		customers.add(cust9);
		customers.add(cust10);
 
		List<Product> products = new ArrayList<>();
		
		Product prod1 = new Product(1l, "omnis quod consequatur", "Games", 184.83);
		Product prod2 = new Product(2l, "vel libero suscipit", "Toys", 12.66);
		Product prod3 = new Product(3l, "non nemo iure", "Grocery", 498.02);
		Product prod4 = new Product(4l, "voluptatem voluptas aspernatur", "Toys", 536.80);
		Product prod5 = new Product(5l, "animi cum rem", "Games", 458.20);
		Product prod6 = new Product(6l, "dolorem porro debitis", "Toys", 146.52);
		Product prod7 = new Product(7l, "aspernatur rerum qui", "Books", 656.42);
		Product prod8 = new Product(8l, "deleniti earum et", "Baby", 41.46);
		Product prod9 = new Product(9l, "voluptas ut quidem", "Books", 697.57);
		Product prod10 = new Product(10l, "eos sed debitis", "Baby", 366.90);
 
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		products.add(prod5);
		products.add(prod6);
		products.add(prod7);
		products.add(prod8);
		products.add(prod9);
		products.add(prod10);
 
		List<Order> orders = new ArrayList<>();
		
		Order order1 = new Order(1l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 8), "NEW", 5l);
		Order order2 = new Order(2l, LocalDate.of(2021, 2, 28), LocalDate.of(2021, 3, 5), "NEW", 3l);
		Order order3 = new Order(3l, LocalDate.of(2021, 4, 10), LocalDate.of(2021, 4, 18), "DELIVERED", 5l);
		Order order4 = new Order(4l, LocalDate.of(2021, 3, 22), LocalDate.of(2021, 3, 27), "PENDING", 3l);
		Order order5 = new Order(5l, LocalDate.of(2021, 3, 4), LocalDate.of(2021, 3, 12), "NEW", 1l);
		Order order6 = new Order(6l, LocalDate.of(2021, 3, 30), LocalDate.of(2021, 4, 7), "DELIVERED", 9l);
		Order order7 = new Order(7l, LocalDate.of(2021, 3, 5), LocalDate.of(2021, 3, 9), "PENDING", 8l);
		Order order8 = new Order(8l, LocalDate.of(2021, 3, 27), LocalDate.of(2021, 4, 5), "NEW", 4l);
		Order order9 = new Order(9l, LocalDate.of(2021, 4, 14), LocalDate.of(2021, 4, 18), "NEW", 10l);
		Order order10 = new Order(10l, LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 19), "NEW", 8l);
 
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		orders.add(order5);
		orders.add(order6);
		orders.add(order7);
		orders.add(order8);
		orders.add(order9);
		orders.add(order10);
 
		System.out.println("**********Books with price > 100***********");
		
		String category1 ="Books";
		List<Product> Ques1 = new ArrayList<Product>();
		for(Product item:products) {
			if(item.getCategory().equals(category1)) {
				if(item.getPrice()>100) {
					Ques1.add(item);
				}
			}
		}
		for (Product listItems: Ques1) {
			System.out.println(listItems);
		}	
		
		System.out.println();
		System.out.println("*********Belongs to category baby***********");
		
		 String category2 ="Baby";
			List<Product> Ques2 = new ArrayList<Product>();
			for(Product item:products) {
				if(item.getCategory().equals(category2)) {
					Ques2.add(item);
				}
			}
			for (Product listItems: Ques2) {
				System.out.println(listItems);
			}	
			
			System.out.println();
			System.out.println("**********Toys with 10% discount***************");
			
	        String category3 ="Toys";
			List<Product> Ques3 = new ArrayList<Product>();
			for(Product item:products) {
				if(item.getCategory().equals(category3)) {
					double newprice = item.getPrice() * 0.9;
					item.setPrice(newprice);
					Ques3.add(item);
				}
			}
			for (Product listItems: Ques3) {
				System.out.println(listItems);
			}
			
			System.out.println();
			System.out.println("**********List of products ordered b/w feb and apr***************");
			
			List<Product> tier2CustomerProducts = new ArrayList<>();
	        for (Order order : orders) {
	            if (order.getOrderDate().isAfter(LocalDate.of(2021, 2, 1))
	                    && order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1))) {
	                for (Customer customer : customers) {
	                    if (customer.getCustId() == order.getCustId() && customer.getTier() == 2) {
	                        for (Product product1 : products) {
	                            if (product1.getProductId() == order.getCustId()) {
	                                tier2CustomerProducts.add(product1);
	                                break; // Stop searching for this order's products if a match is found
	                            }
	                        }
	                        break; // Stop searching for more customers if a match is found
	                    }
	                }
	            }
	        }
	        for (Product product1 : tier2CustomerProducts) {
	            System.out.println(product1);
	        }
			
			System.out.println();
			System.out.println("************Cheapest Books***************");
			
			Product cheapestBook = null;
	        double minPrice = Double.MAX_VALUE;
	        for (Product product1 : products) {
	            if (product1.getCategory().equalsIgnoreCase("Books") && product1.getPrice() < minPrice) {
	                cheapestBook = product1;
	                minPrice = product1.getPrice();
	            }
	        }
	        System.out.println(cheapestBook);
			
		
		
}

}
