package models;

import utils.Utils;

public class Actor {

    Integer id;

    String name;

    Integer age;

    String email;

    String portfolioLink;

    public Actor(String name, Integer age, String email, String portfolioLink) {
        this.id = Utils.getActorId();
        this.name = name;
        this.age = age;
        this.email = email;
        this.portfolioLink = portfolioLink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPortfolioLink() {
        return portfolioLink;
    }

    public void setPortfolioLink(String portfolioLink) {
        this.portfolioLink = portfolioLink;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", portfolioLink='" + portfolioLink + '\'' +
                '}';
    }
}
