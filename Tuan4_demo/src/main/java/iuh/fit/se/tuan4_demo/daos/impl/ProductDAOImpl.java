package iuh.fit.se.tuan4_demo.daos.impl;

import iuh.fit.se.tuan4_demo.daos.ProductDAO;
import iuh.fit.se.tuan4_demo.entities.Product;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO {
    private final DataSource datasource;

    public ProductDAOImpl(DataSource dataSource) {
        this.datasource = dataSource;
    }


    @Override
    public List<Product> findAll() {
//        String sql = "SELECT id, name, price, image FROM product";
//        List<Product> list = new ArrayList<>();
//        try (
//                Connection con = (Connection) this.datasource.getConnection();
//                PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
//                ResultSet rs = ps.executeQuery();) {
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                Double price = rs.getDouble("price");
//                String image = rs.getString("image");
//                list.add(new Product(id, name, price,image));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return list;
//    }

        String sql = "select id, name, price, image from product";
        List<Product> list = new ArrayList<>();

        try (
                Connection con = (Connection) this.datasource.getConnection();
                PreparedStatement ps = (PreparedStatement) con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Double price =  rs.getDouble("price");
                String image = rs.getString("image");
                list.add(new Product(id, name, price, image));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
