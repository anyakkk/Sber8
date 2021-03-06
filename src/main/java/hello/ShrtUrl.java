package hello;

import javax.persistence.*;

@Entity
public class ShrtUrl {

    @Id
    private String shortUrl;
    @Column(length = 10000)
    private String fullUrl;

    public ShrtUrl() {
    }

    public ShrtUrl(String shortUrl, String fullUrl) {
        this.shortUrl = shortUrl;
        this.fullUrl = fullUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public String cutUrl() {
        if (fullUrl.length() < 50)
            return fullUrl;
        return fullUrl.substring(0,47) + "...";
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl(String fullUrl) {
        this.fullUrl = fullUrl;
    }
}