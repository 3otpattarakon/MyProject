package com.myproject.robot.devrobot.model.dto;

import java.io.IOException;

public class ProgramLauncher {

    public static void open(String path) {
        try {
            Runtime.getRuntime().exec(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openPair(String key) {
        if ("chrome".equals(key)) {
            open("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application");
            open("C:\\Users\\pattt\\AppData\\Local\\Programs\\Microsoft VS Code");
        }
    }
}
