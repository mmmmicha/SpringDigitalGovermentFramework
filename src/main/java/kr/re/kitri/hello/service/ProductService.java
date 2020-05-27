package kr.re.kitri.hello.service;


import kr.re.kitri.hello.model.Product;

public interface ProductService {

    public String retrieveProducts();
    public Product viewProductDetail(int productId);

}
