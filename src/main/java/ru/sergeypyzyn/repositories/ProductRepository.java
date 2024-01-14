package ru.sergeypyzyn.repositories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sergeypyzyn.models.Product;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class ProductRepository {

    private List<Product> products;

    public ProductRepository(){
        this.products = new ArrayList<>();
    }

    public List<Product> getAllProduct (){
        return new ArrayList<>(products);
    }

    public void addProduct (Product product){
        products.add(product);
    }

    public void removeProduct (Product product){
        products.remove(product);
    }

}
