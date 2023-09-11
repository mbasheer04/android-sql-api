package com.androidsql.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.androidsql.api.Models.User;
import com.androidsql.api.Repo.UserRepo;

@RestController
public class APIControllers {

    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/getusers")
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @PostMapping(value = "/saveuser")
    public String saveUser(@RequestBody User user){
        userRepo.save(user);
        return "Saved.";
    }

    @PutMapping(value = "/updateuser/{id}")
    public String updateUser(@PathVariable long id, @RequestBody User user){
        User updatedUser = userRepo.findById(id).get();
        updatedUser.setHome_lat(user.getHome_lat());
        updatedUser.setHome_long(user.getHome_long());
        updatedUser.setAndroid_id(user.getAndroid_id());
        userRepo.save(updatedUser);
        return "Updated.";
    }

    @DeleteMapping(value = "/deleteuser/{id}")
    public String deleteUser(@PathVariable long id){
        User deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Deleted user " + id;
    }

}
