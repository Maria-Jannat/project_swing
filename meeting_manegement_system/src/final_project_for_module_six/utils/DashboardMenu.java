/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project_for_module_six.utils;

import final_project_for_module_six.designView.AboutView;
import final_project_for_module_six.designView.EmployeeView;
import final_project_for_module_six.designView.DashboardView;
import final_project_for_module_six.designView.DepartmentView;
import final_project_for_module_six.designView.MeetingCancelView;
import final_project_for_module_six.designView.MeetingView;
import final_project_for_module_six.designView.OfficeTypeView;
import final_project_for_module_six.designView.OfficeView;
import final_project_for_module_six.designView.PositionView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author HP
 */
public class DashboardMenu {

    public DashboardMenu() {
    }

    public static JMenuBar displayMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();

        JMenu menu1 = new JMenu("Menu");
        menuBar.add(menu1);

        JMenu menu2 = new JMenu("About");
        menuBar.add(menu2);

        JMenuItem about = new JMenuItem("About us");
        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new AboutView().setVisible(true);
            }
        });
        menu2.add(about);

//        menuBar.add(new JMenu("About"));

        JMenuItem m1 = new JMenuItem("Office Type");
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new OfficeTypeView().setVisible(true);
            }
        });
        menu1.add(m1);

        JMenuItem m2 = new JMenuItem("Office Info");
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new OfficeView().setVisible(true);
            }
        });
        menu1.add(m2);

        JMenuItem m3 = new JMenuItem("Position");
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PositionView().setVisible(true);
            }
        });
        menu1.add(m3);

        JMenuItem m4 = new JMenuItem("Department");
        m4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DepartmentView().setVisible(true);
            }
        });
        menu1.add(m4);

        JMenuItem m5 = new JMenuItem("Affix Employee");
        m5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new EmployeeView().setVisible(true);
            }
        });
        menu1.add(m5);

        JMenuItem m6 = new JMenuItem("Set Meeting");
        m6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new MeetingView().setVisible(true);
            }
        });
        menu1.add(m6);

        JMenuItem m7 = new JMenuItem("Cancel Meeting");
        m7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new MeetingCancelView().setVisible(true);
            }
        });
        menu1.add(m7);

                JMenuItem m8 = new JMenuItem("Dashboard");
        m8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DashboardView().setVisible(true);
            }
        });
        menu1.add(m8);
        
        JMenuItem logout = new JMenuItem("Logout");
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu1.add(logout);

        return menuBar;
    }
}
