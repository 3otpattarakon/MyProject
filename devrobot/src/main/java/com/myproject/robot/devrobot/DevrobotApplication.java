package com.myproject.robot.devrobot;

import javax.swing.SwingUtilities;
import com.myproject.robot.devrobot.UI.FloatingPopup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevrobotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevrobotApplication.class, args);

		 // เรียก Popup
        SwingUtilities.invokeLater(() -> {
            new FloatingPopup();
        });
	}

}
