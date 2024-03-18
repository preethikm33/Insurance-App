package com.Userservice.Repository;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Userservice.model.User;
@Repository
public interface UserRepo extends JpaRepository <User, Integer>{
	User findByEmail(String email);
	@Query("SELECT u.email, u.password FROM User u")
    
	List<Object[]> findAllEmailAndPassword();
}
     