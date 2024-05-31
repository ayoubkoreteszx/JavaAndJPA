package customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //save [Product] to database
    public void save(Product product) {
        jdbcTemplate.update("INSERT INTO product VALUES (?,?,?,?)",
                product.getProductNumber(), product.getName(), product.getPrice(), product.getSupplier());
    }
    //get all [Product] from database
    public List<Product> getAllProducts() {
        return jdbcTemplate.query("SELECT * FROM product",
                (rs, rowNum) -> new Product(rs.getInt("productNumber"),
                        rs.getString("name"),
                        rs.getDouble("price"),rs.getInt("supplierNumber")));
    }
    //delete [Product] from database
    public void deleteProduct(int productNumber) {
        jdbcTemplate.update("DELETE FROM product WHERE productNumber = ?", productNumber);
    }
    //find product by productNumber
    public Product findProduct(int productNumber) {
        return jdbcTemplate.queryForObject("SELECT * FROM product WHERE productNumber = ?",
                (rs, rowNum) -> new Product(rs.getInt("productNumber"),
                        rs.getString("name"),
                        rs.getDouble("price"),rs.getInt("supplierNumber")),
                productNumber);
    }
    // find by product name
    public List<Product> findProductByName(String name) {
        return jdbcTemplate.query("SELECT * FROM product WHERE name = ?",
                (rs, rowNum) -> new Product(rs.getInt("productNumber"),
                        rs.getString("name"),
                        rs.getDouble("price"),rs.getInt("supplierNumber")),
                name);
    }




}
