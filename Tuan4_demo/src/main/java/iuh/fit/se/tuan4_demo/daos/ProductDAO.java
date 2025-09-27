package iuh.fit.se.tuan4_demo.daos;

import iuh.fit.se.tuan4_demo.entities.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();
}
