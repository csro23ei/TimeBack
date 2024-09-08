package com.TimeTracker.TimeTracker;

@Component
@EnableScheduling
public class Scheduler {
    private final TaskService taskService;

    public Scheduler(TaskService taskService) {
        this.taskService = taskService;
    }

    @Scheduled(cron = "0 0 0 * * MON")
    public void softDeleteMonday() {
        taskService.softDeleteMonday();
    }
}