package com.example.demo.views;

import com.example.demo.data.HighSchoolSchedule;
import com.example.demo.data.MiddleSchoolSchedule;
import com.example.demo.data.Schedule;
import com.example.demo.views.components.Footer;
import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.*;

@PageTitle("Schedule | Toronto Big League")
@Route(value = "/schedule", layout = MainLayout.class)

public class ScheduleView extends VerticalLayout {

    public ScheduleView(){

        add(new MainLayout());
        this.setPadding(false);

        H1 title = new H1();
        title.setWidthFull();
        title.setText("Session Dates");
        title.addClassName("center");

        H2 middleTitle = new H2();
        middleTitle.setText("Middle School Madness");
        middleTitle.addClassName("center");

        Grid<MiddleSchoolSchedule> scheduleGrid = new Grid<>(MiddleSchoolSchedule.class);
        scheduleGrid.getElement().getStyle().set("margin-left", "10px");
        scheduleGrid.getElement().getStyle().set("margin-right", "10px");
        List<MiddleSchoolSchedule> middleSchoolSchedules = Arrays.asList(
                new MiddleSchoolSchedule("Grade 4", "Nov 25-26", "Dec 9-10", "Jan 13-14", "Feb 24-25", "Mar 9-10"),
                new MiddleSchoolSchedule("Grade 5", "Nov 25-26", "Dec 9-10", "Jan 13-14", "Feb 24-25", "Mar 9-10"),
                new MiddleSchoolSchedule("Grade 6", "Nov 25-26", "Dec 9-10", "Jan 13-14", "Feb 24-25", "Mar 9-10"),
                new MiddleSchoolSchedule("Grade 7", "Nov 11-12", "Dec 2-3", "Jan 20-21", "Feb 17-18", "Mar 2-3"),
                new MiddleSchoolSchedule("Grade 8", "Nov 11-12", "Dec 2-3", "Jan 20-21", "Feb 17-18", "Mar 2-3")
        );

        scheduleGrid.setItems(middleSchoolSchedules);

        Grid<HighSchoolSchedule> highSchoolScheduleGrid = new Grid<>(HighSchoolSchedule.class);
        highSchoolScheduleGrid.getElement().getStyle().set("margin-left", "10px");
        highSchoolScheduleGrid.getElement().getStyle().set("margin-right", "10px");
        List<HighSchoolSchedule> highSchoolSchedules = Arrays.asList(
                new HighSchoolSchedule("Grade 9", "Feb 24-25", "Mar 16-17", "Mar 23-24", "Apr 13-14", "Apr 27-28", "May 4-5", "May 18-19", "Jun 8-9"),
                new HighSchoolSchedule("Grade 10", "Feb 24-25", "Mar 16-17", "Mar 23-24", "Apr 13-14", "Apr 27-28", "May 4-5", "May 18-19", "Jun 8-9"),
                new HighSchoolSchedule("Grade 11", "Feb 24-25", "Mar 16-17", "Mar 23-24", "Apr 13-14", "Apr 27-28", "May 4-5", "May 18-19", "Jun 8-9"),
                new HighSchoolSchedule("Grade 12", "Feb 24-25", "Mar 16-17", "Mar 23-24", "Apr 13-14", "Apr 27-28", "May 4-5", "May 18-19", "Jun 8-9")
        );
        highSchoolScheduleGrid.setItems(highSchoolSchedules);

        H2 highTitle = new H2();
        highTitle.setText("High School Madness");
        highTitle.addClassName("center");

        H2 subTitle = new H2();
        subTitle.setText("Game Schedules");
        Anchor link = new Anchor();
        link.setHref("https://basketball.exposureevents.com/209083/middle-school-madness");
        link.setText("Game schedule Link");

//        add(title);
//        add(middleTitle);
//        add(scheduleGrid);
//        add(highTitle);
//        add(highSchoolScheduleGrid);
//        add(subTitle);
//        add(link);



        H1 sessionTitle = new H1();
        sessionTitle.setWidthFull();
        sessionTitle.setText("April 13-14");
        sessionTitle.addClassName("center");

        Div div = new Div();
        div.setWidthFull();
        div.addClassName("center");





        H2 satTitle = new H2("Saturday April 13");
        satTitle.setWidthFull();

        Text satLocation = new Text("AT Bill Crothers S.S.");

        Grid<Schedule> sat = new Grid<>(Schedule.class, false);
        sat.addThemeVariants(GridVariant.LUMO_WRAP_CELL_CONTENT);
        sat.getElement().getStyle().set("margin-left", "10px");
        sat.getElement().getStyle().set("margin-right", "10px");


        List<Schedule> satList = Arrays.asList(
                new Schedule("8PM", "JR", "BM Elite", "TPG"),
                new Schedule("9PM", "SR", "Team Active 17U", "Wedontmiss")
                );

        sat.addColumn(Schedule::getTime).setHeader("Time").setAutoWidth(true);;
        sat.addColumn(Schedule::getAge).setHeader("Grade").setAutoWidth(true);;
        sat.addColumn(Schedule::getHome).setHeader("Home").setAutoWidth(true);;
        sat.addColumn(Schedule::getAway).setHeader("Away").setAutoWidth(true);;

        sat.setItems(satList);
        sat.setAllRowsVisible(true);

        H2 sunTitle = new H2();
        sunTitle.setWidthFull();
        sunTitle.setText("Sunday April 14");


        Text sunLocation = new Text("");
        sunLocation.setText("AT O'Neil CVI, 301 Simcoe St N, Oshawa, ON L1G 4T2");

        Grid<Schedule> sun = new Grid<>(Schedule.class,false);
        sun.addThemeVariants(GridVariant.LUMO_WRAP_CELL_CONTENT);
        sun.getElement().getStyle().set("margin-left", "10px");
        sun.getElement().getStyle().set("margin-right", "10px");

        List<Schedule> sunList = Arrays.asList(

                new Schedule("11AM", "SR", "Kingston Elite", "Project Excellence"),
                new Schedule("12PM", "SR", "Team Active 16U", "DC United"),
                new Schedule( "1PM", "SR", "Team Active 17U", "BM Elite"),
                new Schedule( "2PM", "JR", "Project Excellence", "BM Elite"),
                new Schedule("3PM", "SR", "Team Active 16U", "Kingston Elite"),
                new Schedule( "4PM", "SR", "Team Active 17U", "DC United")
        );
        sun.addColumn(Schedule::getTime).setHeader("Time").setAutoWidth(true);;
        sun.addColumn(Schedule::getAge).setHeader("Grade").setAutoWidth(true);;
        sun.addColumn(Schedule::getHome).setHeader("Home").setAutoWidth(true);;
        sun.addColumn(Schedule::getAway).setHeader("Away").setAutoWidth(true);;

        sun.setItems(sunList);
        sun.setAllRowsVisible(true);


        //saturday
        add(sessionTitle);
        Text disclaimer = new Text("*Schedule may change. Please double check.");

        Html br = new Html("<br>");
        Html br1 = new Html("<br>");
        add(div, disclaimer, br, satTitle, satLocation,sat, br1, sunTitle,sunLocation,sun);



        add(new Footer());


    }




}
