package com.example.mck.newsapps1;

public class News {
    /**
     * Section name of the news
     */
    private String mSectionName;

    /**
     * Web title of the news
     */
    private String mWebTitle;

    /**
     * Web publication date of the news
     */
    private String mWebPublicationDate;

    /**
     * Website URL of the news
     */
    private String mUrl;

    /**
     * Author of the news
     */
    private String mAuthor;

    /**
     * Constructs a new {@link News} object.
     *
     * @param sectionName        is the name of the news
     * @param webTitle           is the short title describing news
     * @param webPublicationDate is the date of the web publication
     * @param url                is the website URL to find more details about the news
     */
    public News(String sectionName, String webTitle, String webPublicationDate, String url, String author) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mUrl = url;
        mAuthor = author;
    }

    /**
     * Returns the section name of the news.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the web title of the news.
     */
    public String getmWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the date of the web publication.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     * Returns the author of the news.
     */
    public String getAuthor() {
        return mAuthor;
    }
}