package hu.ait.missbeauty.data;

/**
 * Created by ChenChen on 5/20/17.
 */

public class Post {
    private String uid;
    private String author;
    private String name;
    private String caption;
    private String imageUrl;

    public Post(){
    }

    public Post(String uid, String author, String name, String caption) {
        this.uid = uid;
        this.author = author;
        this.name = name;
        this.caption = caption;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
