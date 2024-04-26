package edu.traning.web.entity;

import java.io.Serializable;
import java.util.Objects;

public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String brief;
    private String link;

    public News() {
    }

    public News(String title, String brief, String link) {
        this.title = title;
        this.brief = brief;
        this.link = link;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return Objects.equals(title, news.title) && Objects.equals(brief, news.brief) && Objects.equals(link, news.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, brief, link);
    }

    @Override
    public String toString() {
        return "News [title=" + title + ", brief=" + brief + ", link=" + link + "]";
    }

}
