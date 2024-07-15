package study.santanderproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.santanderproject.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
