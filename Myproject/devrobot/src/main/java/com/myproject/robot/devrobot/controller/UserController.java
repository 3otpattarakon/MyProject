package com.myproject.robot.devrobot.controller;

import org.springframework.web.bind.annotation.*;
import com.myproject.robot.devrobot.model.entity.UserAccount;
import com.myproject.robot.devrobot.repository.UserAccountRepo;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserAccountRepo repo;
    public UserController(UserAccountRepo repo) { this.repo = repo; }

    @PostMapping
    public UserAccount create(@RequestBody UserAccount u){ return repo.save(u); }

    @GetMapping
    public List<UserAccount> list(){ return repo.findAll(); }
}
