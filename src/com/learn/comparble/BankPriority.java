package com.learn.comparble;

public class BankPriority {


    public enum Priority {
        LOW(0),
        MEDIUM(1),
        HIGH(2);

        private final int value;

        Priority(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private String username;
    private int userId;
    private Priority priority;

    public BankPriority(String username, int userId, Priority priority) {
        this.username = username;
        this.userId = userId;
        this.priority = priority;
    }

    public String getUsername() {
        return username;
    }

    public int getUserId() {
        return userId;
    }

    public Priority getPriority() {
        return priority;
    }

    public int getPriorityValue() {
        return priority.getValue();
    }
}
