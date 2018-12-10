package com.bespalov.shop.dao;

import com.bespalov.shop.model.Product;
import com.bespalov.shop.model.Shop;

public interface CommandDAO {
    String getAllProduct();

    String getProduct(String title);

    String addProduct(Product product);

    String updateProduct(Product product);

    String deleteProduct(String title);

    String getAllShop();

    String getShop(String title);

    String addShop(Shop shop);

    String updateShop(Shop shop);

    String deleteShop(String title);
}
