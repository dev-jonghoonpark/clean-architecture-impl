package dto;

import entities.User;

public class OutputData {
    private final String name;

    public OutputData(User user) {
        this.name = user.getName();
    }

    public String getEmail() {
        return name;
    }
}