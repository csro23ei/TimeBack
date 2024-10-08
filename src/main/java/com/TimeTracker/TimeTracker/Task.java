package com.TimeTracker.TimeTracker;

import java.time.LocalDate;

@Document(collection = "Tasks")
public class Task {
    @Id
    private String id;
    private String taskName;
    private long time;
    private LocalDate taskDate;
    private boolean deleted;

    public Task(String id, String taskName, long time, LocalDate taskDate, boolean deleted) {
        this.id = id;
        this.taskName = taskName;
        this.time = time;
        this.taskDate = taskDate;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}