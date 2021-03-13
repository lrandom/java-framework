package javafrm.demo.repos;

import javafrm.demo.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends
        PagingAndSortingRepository<User,Long> {

}
