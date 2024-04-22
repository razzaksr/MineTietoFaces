import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ProductBean implements Serializable {
    private List<Product> products;
    private Product selectedProduct;
    private Product newProduct;

    public ProductBean() {
        products = new ArrayList<>();
        // Initialize some dummy data
        products.add(new Product(1, "Product 1", 10.0));
        products.add(new Product(2, "Product 2", 20.0));
        products.add(new Product(3, "Product 3", 30.0));
        newProduct = new Product(); // Initialize newProduct with default values
    }

    // Getter and setter methods

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }

    // CRUD operations

    public void addProduct() {
        // Assign a new ID for the new product
        int newId = products.size() + 1;
        newProduct.setId(newId);
        products.add(newProduct);
        newProduct = new Product(); // Reset newProduct after adding
    }

    public void updateProduct(Product product) {
        // Implement update logic
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }
}
