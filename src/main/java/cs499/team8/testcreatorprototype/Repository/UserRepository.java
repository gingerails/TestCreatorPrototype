package cs499.team8.testcreatorprototype.Repository;

import cs499.team8.testcreatorprototype.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserID(String UserID);

    @Query("SELECT COUNT(u) FROM User u")
    Long getTotalUsers();


    User findByUserID(String userID);


}
