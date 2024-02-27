package com.project.webservice.webapi.repositories.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.webservice.webapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
   
    // @Query(value = "SELECT u FROM u mst_users WHERE u.first_name like %?1% OR u.last_name like %?2%", nativeQuery = true)
    // List<User> findByName(String firstName, String lastName);
}
