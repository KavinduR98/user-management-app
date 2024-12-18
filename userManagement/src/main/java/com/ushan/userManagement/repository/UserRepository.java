package com.ushan.userManagement.repository;

import com.ushan.userManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

//    This is the way how to write a query with parameter placement. And also we can give this parameters
//    like this. "WHERE name = ?2 AND id = ?1"
    @Query(value = "SELECT * FROM User WHERE id = ?1", nativeQuery = true)
    User getUserById(Integer userId);
}
