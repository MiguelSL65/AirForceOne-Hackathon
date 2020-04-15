package org.academiadecodigo.rhashtafaris.kakathon.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson extends AbstractModel {

    private String title;
    private String pathImage;

    @OneToOne
    private Challenge challenge;

    @ManyToOne
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public Challenge getChallenge() {
        return challenge;
    }

    public void setChallenge(Challenge challenge) {
        this.challenge = challenge;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
