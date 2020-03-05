package com.atfotiad.landmarks.Model;

public class Landmark {
    CharSequence name, link;
    String image;

    public Landmark() {
    }

    public Landmark(CharSequence name, CharSequence link, String image) {
        this.name = name;
        this.link = link;
        this.image = image;
    }


    public CharSequence getName() {
        return name;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    public CharSequence getLink() {
        return link;
    }

    public void setLink(CharSequence link) {
        this.link = link;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
