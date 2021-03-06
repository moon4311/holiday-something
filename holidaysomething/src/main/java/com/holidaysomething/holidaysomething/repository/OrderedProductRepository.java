package com.holidaysomething.holidaysomething.repository;

import com.holidaysomething.holidaysomething.domain.OrderedProduct;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedProductRepository extends JpaRepository<OrderedProduct, Long> {

  //주문 아이디로 그에 속한 상품들을 상품번호 순으로 검색
  List<OrderedProduct> findByOrderIdOrderByProductId(Long orderId);
}
