package com.javarush.test.level09.lesson02.task02;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.File;

/**
 * Created by Гена on 17.06.2015.
 */
public class TestFrame extends JFrame {
    public TestFrame() {
        super("Тестовое окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        final JPanel rootContent = new JPanel();
        rootContent.setLayout(new BoxLayout(rootContent, BoxLayout.Y_AXIS));
        final JScrollPane rootContentScroll = new JScrollPane(rootContent);
        File[] roots = File.listRoots();
        final JList list = new JList(roots);
        list.setVisibleRowCount(5);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                rootContent.removeAll();
                File root = (File) list.getSelectedValue();
                File[] children = root.listFiles();
                if (children != null) {
                    for (int i = 0; i < children.length; i++) {
                        JLabel label = new JLabel(children[i].getName());
                        rootContent.add(label);
                    }
                }
                rootContent.repaint();
                rootContentScroll.revalidate();
            }
        });

        mainPanel.add(new JScrollPane(list), BorderLayout.NORTH);
        mainPanel.add(rootContentScroll, BorderLayout.CENTER);

        getContentPane().add(mainPanel);

        setPreferredSize(new Dimension(260, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                new TestFrame();
            }
        });
    }
}
