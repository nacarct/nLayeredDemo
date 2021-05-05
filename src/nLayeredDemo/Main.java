package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

    public static void main(String[] args) {
        // ToDo Spring IoC ile düzeltilecek
        ProductService productService = new ProductManager(new HibernateProductDao(),new JLoggerAdapter());

        Product product1 = new Product(1,1,"Hp 15 Notebook",5000,10);
        Product product2 = new Product(2,2," Sony PS5 Oyun Konsolu",8000,50);

        productService.add(product1);
        productService.add(product2);
    }
}
