package com.mts2d;

import java.util.Date;
import java.util.Objects;

public class Task {
    private long serialVersionUID = 1L;
    private static long tasksCount = 0;
    private long id;
    private String description;
    private Status status;
    private Date createdAt;
    private Date updatedAt;

    public Task(){}

    public Task(String description, Status status, Date createdAt, Date updatedAt) {
        this.id = ++tasksCount;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public static long getTasksCount() {
        return tasksCount;
    }

    public static void setTasksCount(long tasksCount) {
        Task.tasksCount = tasksCount;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return serialVersionUID == task.serialVersionUID && id == task.id && Objects.equals(description, task.description) && status == task.status && Objects.equals(createdAt, task.createdAt) && Objects.equals(updatedAt, task.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialVersionUID, id, description, status, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Task{" +
                "serialVersionUID=" + serialVersionUID +
                ", id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
