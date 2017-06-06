package com.frist;

import javax.swing.*;

/**
 * Created by pig on 2016/12/30.
 */
public class Class1 {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
