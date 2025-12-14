package com.myproject.robot.devrobot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myproject.robot.devrobot.model.entity.UserAccount;

public interface UserAccountRepo extends JpaRepository<UserAccount, Long> {}
