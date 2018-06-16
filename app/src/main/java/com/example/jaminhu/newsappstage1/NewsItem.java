package com.example.jaminhu.newsappstage1;

public class NewsItem {

    private String mTitle;
    private String mCategory;
    private String mDate;
    private String mUrl;

    public NewsItem(String title, String category, String date, String url){
        mTitle = title;
        mCategory = category;
        mDate = date;
        mUrl = url;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getCategory(){
        return mCategory;
    }

    public String getDate(){
        return mDate;
    }

    public String getUrl(){
        return mUrl;
    }

}
