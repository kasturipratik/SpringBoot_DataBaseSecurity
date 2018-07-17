package com.example.springbootdatabasesecurity;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
    User findByUsername(String userbane);
    User findByEmail(String email);
    Long countByEmail(String email);
    Long countByUsername(String username);

}
