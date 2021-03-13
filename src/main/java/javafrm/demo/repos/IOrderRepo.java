package javafrm.demo.repos;

import javafrm.demo.entity.Order;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IOrderRepo extends PagingAndSortingRepository<Order,Long> {
}
