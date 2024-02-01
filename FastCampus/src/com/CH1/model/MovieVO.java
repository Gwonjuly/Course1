package com.CH1.model;

public class MovieVO {
    private String title;
    private String major;
    private String part;
    private int day;
    private int level;
    private float time;

    public MovieVO() {//기본 생성자: Alt + Insert -> Constructor -> Select None
    }

    //생성자 오버로딩(to 초기화): Alt + Insert -> Constructor -> 전부 선택(Shift)
    public MovieVO(String title, String major, String part, int day, int level, float time) {
        this.title = title;
        this.major = major;
        this.part = part;
        this.day = day;
        this.level = level;
        this.time = time;
    }
    //Getter and Setter: Alt + Insert -> Getter and Setter -> 전부 선택
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    //toString: Alt + Insert -> toString() -> 전부 선택

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", major='" + major + '\'' +
                ", part='" + part + '\'' +
                ", day=" + day +
                ", level=" + level +
                ", time=" + time +
                '}';
    }
}
