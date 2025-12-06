package com.nightonke.githubwidget;

/**
 * Created by Weiping on 2016/4/26.
 */
//public enum Weekday {
// D:\programDo\GithubWidget\app\src\main\java\com\nightonke\githubwidget\WeekDay.java:6: error: enum Weekday is public, should be declared in a file named Weekday.java
// public enum Weekday {
// Chanded filename to Weekday

public enum Weekday {
    SUN(0),
    MON(1),
    TUE(2),
    WED(3),
    THU(4),
    FRI(5),
    SAT(6);

    int v;

    Weekday(int v) {
        this.v = v;
    }
}
