package com.CH2.part3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://sum.su.or.kr:8888/bible/today";
        try {//url이 잘못되었을 시 예외 처리
            Document document = Jsoup.connect(url).get();
            Element bible_text = document.getElementById("bible_text");//bible_text: id
            Element bibleinfo_box = document.getElementById("bibleinfo_box");
            System.out.println("bible text: " + bible_text.text());//.text(): text만 추출
            System.out.println("bibleinfo_box: " + bibleinfo_box.text());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
