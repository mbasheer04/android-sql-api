package com.androidsql.api.Repo;

import com.androidsql.api.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long>{
    
}
