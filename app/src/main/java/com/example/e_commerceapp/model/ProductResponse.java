package com.example.e_commerceapp.model;

import java.util.Arrays;
import java.util.List;

public class ProductResponse {
    public ProductResponse() {
    }

    public static ProductResponse getInstance() {
        return new ProductResponse();
    }

    public List<Product> getList() {
        return Arrays.asList(
                new Product("Mustard Yellow Voyager Dopp Kit", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Tan Vegan Voyager Dopp Kit", "Rs. 1499", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Black Vegan Leather Ambry Pouch", "Rs. 999", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Black Vegan Leather Vault Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Crimson Red Ambry Pouch", "Rs. 999", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Crimson Red Vault Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Khaki Beige Ambry Pouch", "Rs. 999", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Khaki Beige Vault Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Midnight Blue Ambry Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Midnight Blue Vault Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Olive Green Ambry Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1"),
                new Product("Olive Green Vault Pouch", "Rs. 1299", "https://images.dailyobjects.com/marche/product-images/1202/walnut-brown-bask-messenger-bag-images/Walnut-Brown-Coach-Messenger-Bag-2n.png?tr=cm-pad_resize,w-291,h-359,dpr-1")
        );
    }
}
