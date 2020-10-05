package com.fudan.domain;

import com.fudan.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * @author zhuruisi
 */

@RestController
public class UserController {

    private HashMap<String, User> map = new HashMap<>();
    public UserController(){
        User user1 = new User("20200001", "Amy", "CS", "data");
        User user2 = new User("20200002", "Sam", "CS", "software");
        User user3 = new User("20200003", "Taylor",  "SE", "data");

        map.put(user1.getStudentId(), user1);
        map.put(user2.getStudentId(), user2);
        map.put(user3.getStudentId(), user3);
    }

    /**
     * 添加学生 - Post
     * @param user
     * @return
     */
    @PostMapping("/api/v1/student")
    public User insertUser(@RequestBody User user){
        map.put(user.getStudentId(), user);
        System.out.println(("user add..."));
        return user;
    }

    /**
     * 查看学生 - GET
     * @return
     */
    @GetMapping("/api/v1/student")
    public HashMap<String, User> findUser(){
        System.out.println("find all...");
        return map;
    }

    /**
     * 修改学生信息 - PUT
     * @param user
     * @return
     */
    @PutMapping("/api/v1/student")
    public User updateUser(@RequestBody User user) {
        System.out.println("update user...");
        map.replace(user.getStudentId(), user);
        return user;
    }

    /**
     * 删除学生 - DELETE
     * @param user
     * @return
     */
    @DeleteMapping("/api/v1/student")
    public User deleteUser(@RequestBody User user) {
        System.out.println("delete user..." + user.getStudentId());
        map.remove(user.getStudentId());
        return user;
    }

}
