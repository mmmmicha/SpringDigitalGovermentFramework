package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.ProductDao;
import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDAO;

    public String retrieveProducts(){
        // 2. 전체상품을 조회하는 작업 수행... -- Service
        // 3. 데이터베이스(오라클) 에 접속 -- Service
        // 4. 쿼리를 날린다. (select * from products) -- Service
        // last. 결과를 전달한다.
        return productDAO.selectProducts();

    }

    public Product viewProductDetail(int productId)
    {
        return productDAO.selectProductsById(productId);
    }
}
