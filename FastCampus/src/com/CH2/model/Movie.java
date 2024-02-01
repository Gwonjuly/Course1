package com.CH2.model;

public class Movie {
    private String title;//정보 은닉
    private String director;
    private String year;
    private String country;

    public Movie(){}//기본 생성자

    public Movie(String title, String director, String year, String country) {//생성자 오버로딩
        this.title = title;
        this.director = director;
        this.year = year;
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
