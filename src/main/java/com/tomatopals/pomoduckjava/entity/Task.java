package com.tomatopals.pomoduckjava.entity;

import java.sql.Date;
import java.util.List;
// import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;
// import javax.persistence.OneToMany;
import javax.persistence.Table;

// import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // @OneToMany(mappedBy = "task")
    // private Set<User> user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER_ID", referencedColumnName = "id")
    // @Cascade({ org.hibernate.annotations.CascadeType.ALL })
    private User userId;

    // @ManyToOne
    // @Column(nullable = false, name = "TASK_ID")
    // private String taskId;

    @Column(nullable = false, name = "TASK_NAME")
    private String taskName;

    @Column(nullable = false, name = "ESTIMATED_POMS ")
    private Integer estimatedPoms;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "POM_SECONDS")
    private Integer pomSeconds;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "BREAK_SECONDS")
    private Integer breakSeconds;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "COMPLETED_POMS")
    private Integer completedPoms;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "COMPLETED_SMALL_BREAKS")
    private Integer completedSmallBreaks;

    @Column(nullable = true, columnDefinition = "integer default 0", name = "COMPLETED_BIG_BREAKS")
    private Integer completedBigBreaks;

    @Column(nullable = true, columnDefinition = "boolean default false", name = "IS_COMPLETE")
    private Boolean isComplete;

    @Column(nullable = true, columnDefinition = "date default null", name = "START_DATE")
    private Date startDate;

    @Column(nullable = true, columnDefinition = "date default null", name = "COMPLETE_DATE")
    private Date completeDate;

    public Task() {

    }

    public Task(String taskName, Integer estimatedPoms, Integer pomSeconds, Integer breakSeconds, Integer completedPoms,
            Integer completedSmallBreaks, Integer completedBigBreaks, Boolean isComplete, Date startDate,
            Date completeDate) {
        super();
        this.taskName = taskName;
        this.estimatedPoms = estimatedPoms;
        this.pomSeconds = pomSeconds;
        this.breakSeconds = breakSeconds;
        this.completedPoms = completedPoms;
        this.completedSmallBreaks = completedSmallBreaks;
        this.completedBigBreaks = completedBigBreaks;
        this.isComplete = isComplete;
        this.startDate = startDate;
        this.completeDate = completeDate;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getEstimatedPoms() {
        return estimatedPoms;
    }

    public void setEstimatedPoms(Integer estimatedPoms) {
        this.estimatedPoms = estimatedPoms;
    }

    public Integer setPomSeconds() {
        return pomSeconds;
    }

    public void getPomSeconds(Integer pomSeconds) {
        this.pomSeconds = pomSeconds;
    }

    public Integer setBreakSeconds() {
        return breakSeconds;
    }

    public void getBreakSeconds(Integer breakSeconds) {
        this.breakSeconds = breakSeconds;
    }

    public Integer getCompletedPoms() {
        return completedPoms;
    }

    public void setCompletedPoms(Integer completedPoms) {
        this.completedPoms = completedPoms;
    }

    public Integer getCompletedSmallBreaks() {
        return completedSmallBreaks;
    }

    public void setCompletedSmallBreaks(Integer completedSmallBreaks) {
        this.completedSmallBreaks = completedSmallBreaks;
    }

    public Integer getCompletedBigBreaks() {
        return completedBigBreaks;
    }

    public void setCompletedBigBreaks(Integer completedBigBreaks) {
        this.completedBigBreaks = completedBigBreaks;
    }

    public Boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public User getUserId() {
        return userId;
    }

    // public void setUserId(User userId) {
    // this.userId = userId;
    // }

    // public Set<User> getUser() {
    // return user;
    // }

    // public void setUser(Set<User> user) {
    // this.user = user;
    // }

    public List<Task> findAll() {
        return null;
    }

}
