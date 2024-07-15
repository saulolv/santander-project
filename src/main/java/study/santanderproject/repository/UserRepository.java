package study.santanderproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import study.santanderproject.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query("SELECT u FROM tb_user u WHERE u.name = :name")
//    User findByUsername(String name);
//
//    @Query("SELECT u FROM tb_user u WHERE u.account.number = :number")
//    boolean existsByAccountNumber(String accountNumber);
}
