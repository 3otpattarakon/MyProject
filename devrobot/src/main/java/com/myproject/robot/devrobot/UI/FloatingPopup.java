package com.myproject.robot.devrobot.UI;

import javax.swing.*;

import com.myproject.robot.devrobot.model.dto.ProgramLauncher;

import java.awt.*;
import java.awt.event.*;

public class FloatingPopup extends JFrame {

    private Point mouseClickPoint;

    public FloatingPopup() {
        setTitle("Dev Robot");
        setSize(200, 100);
        setUndecorated(true);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openBtn = new JButton("Open Programs");
        openBtn.addActionListener(e -> {
            try {
                ProgramLauncher.openPair("Brave");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Failed to open program: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        add(openBtn);
        enableDrag();
        setVisible(true);
    }

    private void enableDrag() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                mouseClickPoint = e.getPoint();
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point location = getLocation();
                setLocation(
                    location.x + e.getX() - mouseClickPoint.x,
                    location.y + e.getY() - mouseClickPoint.y
                );
            }
        });
    }
}
    

