package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    public String selectProducts() {
        // DB에 접속... 쿼리 날림..
        // MyBatis..
        // ...
        return "상품목록 받으세요..";
    }

    public Product selectProductsById(int productId) {
        // 디비에서 조회
        Product p = new Product( productId+"", "아이폰11", 500000, "iphone");

        return p;
        //return productId + "번 상품 디테일 정보입니다.";
    }
}
