package com.pcq.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Task {
    private Integer id;
    private String name;
    private String description;
    private Integer userId;
    private Integer targetId;
    private Date planCompleteDate;
    private Date completeDate;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer isPrivacy;
    private Integer state;
    private Integer difficultLevel;
    private Integer priority;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Date getPlanCompleteDate() {
        return planCompleteDate;
    }

    public void setPlanCompleteDate(Date planCompleteDate) {
        this.planCompleteDate = planCompleteDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsPrivacy() {
        return isPrivacy;
    }

    public void setIsPrivacy(Integer isPrivacy) {
        this.isPrivacy = isPrivacy;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDifficultLevel() {
        return difficultLevel;
    }

    public void setDifficultLevel(Integer difficultLevel) {
        this.difficultLevel = difficultLevel;
    }

    public Integer getPriority() { return priority; }

    public void setPriority(Integer priority) { this.priority = priority; }
}
