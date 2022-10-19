package cs499.team8.testcreatorprototype.Repository;

import cs499.team8.testcreatorprototype.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    boolean existsById(String id);
}
