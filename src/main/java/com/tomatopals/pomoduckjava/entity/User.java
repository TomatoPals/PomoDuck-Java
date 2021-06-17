package com.tomatopals.pomoduckjava.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(nullable = false, name = "last_name")
    private String lastName;

    @Column(nullable = false, name = "email")
    private String email;

    @Column(nullable = false, name = "userPassword")
    private String userPassword;

    @Column(nullable = true, columnDefinition = "varchar(255) default null", name = "country")
    private String country;

    @Column(nullable = true, columnDefinition = "varchar(255) default null", name = "alias")
    private String alias;

    @Column(nullable = true, columnDefinition = "varchar(255) default null", name = "alias_image")
    private String aliasImage;

    @Column(nullable = true, columnDefinition = "integer default 1", name = "display_pref")
    private Integer displayPref;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "total_pom_seconds")
    private Integer totalPomSeconds;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "total_small_break_seconds")
    private Integer totalSmallBreakSeconds;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "total_big_break_seconds")
    private Integer totalBigBreakSeconds;

    @Column(nullable = true, columnDefinition = "integer default 25", name = "pom_time")
    private Integer pomTime;

    @Column(nullable = true, columnDefinition = "integer default 5", name = "small_break_time")
    private Integer smallBreakTime;

    @Column(nullable = true, columnDefinition = "integer default 15", name = "big_break_time")
    private Integer bigBreakTime;

    public User() {

    }

    public User(String firstName, String lastName, String email, String userPassword, String country, String alias,
            String alias_image, Integer displayPref, Integer totalPomSeconds, Integer totalSmallBreakSeconds,
            Integer totalBigBreakSeconds, Integer pomTime, Integer smallBreakTime, Integer bigBreakTime) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userPassword = userPassword;
        this.country = country;
        this.alias = alias;
        this.aliasImage = alias_image;
        this.displayPref = displayPref;
        this.totalPomSeconds = totalPomSeconds;
        this.totalSmallBreakSeconds = totalBigBreakSeconds;
        this.totalBigBreakSeconds = totalBigBreakSeconds;
        this.pomTime = pomTime;
        this.smallBreakTime = smallBreakTime;
        this.bigBreakTime = bigBreakTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPasssword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAliasImage() {
        return aliasImage;
    }

    public void setAliasImage(String aliasImage) {
        this.aliasImage = aliasImage;
    }

    public Integer getDisplayPref() {
        return displayPref;
    }

    public void setDisplayPref(Integer displayPref) {
        this.displayPref = displayPref;
    }

    public Integer getTotalPomSeconds() {
        return totalPomSeconds;
    }

    public void setTotalPomSeconds(Integer totalPomSeconds) {
        this.totalPomSeconds = totalPomSeconds;
    }

    public Integer getTotalSmallBreakSeconds() {
        return totalSmallBreakSeconds;
    }

    public void setTotalSmallBreakSeconds(Integer totalSmallBreakSeconds) {
        this.totalSmallBreakSeconds = totalSmallBreakSeconds;
    }

    public Integer getTotalBigBreakSeconds() {
        return totalBigBreakSeconds;
    }

    public void setTotalBigBreakSeconds(Integer totalBigBreakSeconds) {
        this.totalBigBreakSeconds = totalBigBreakSeconds;
    }

    public Integer getPomTime() {
        return pomTime;
    }

    public void setPomTime(Integer pomTime) {
        this.pomTime = pomTime;
    }

    public Integer getSmallBreakTime() {
        return smallBreakTime;
    }

    public void setSmallBreakTime(Integer smallBreakTime) {
        this.smallBreakTime = smallBreakTime;
    }

    public Integer getBigBreakTime() {
        return bigBreakTime;
    }

    public void setBigBreakTime(Integer bigBreakTime) {
        this.bigBreakTime = bigBreakTime;
    }
}
