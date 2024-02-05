package com.company;

import javax.swing.*;
import java.awt.*;

public class SwingForm {

    static int mynum = 3;

    static {
        mynum = 5555;
    }

    public static void main(String[] args) {
        System.out.println(mynum);
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        int[] anchors = {GridBagConstraints.PAGE_START, GridBagConstraints.PAGE_END, GridBagConstraints.LINE_START, GridBagConstraints.LINE_END,
                GridBagConstraints.FIRST_LINE_START, GridBagConstraints.FIRST_LINE_END, GridBagConstraints.LAST_LINE_START, GridBagConstraints.LAST_LINE_END};

        GridBagConstraints constraints = new GridBagConstraints();
        for (int i = 0; i < 35; i++) {
            JTextArea textArea = new JTextArea();
            for (int j = 0; j < ((i%5) + 1); j++) {
                textArea.append("Line" + (j + 1) + "\n");
            }

            constraints.anchor = anchors[i % anchors.length];
            constraints.gridx = i % 7;
            constraints.gridy = i / 7;
            frame.add(new JScrollPane(textArea), constraints);
        }

        frame.pack();
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
