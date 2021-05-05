package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile kayıt edildi : " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Hibernate ile güncellendi.");
    }

    @Override
    public void delete(Product product) {
        System.out.println("Hibernate ile silindi.");
    }

    @Override
    public Product get(int productId) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
