package dataaccess;

import entities.User;
import interactor.interfaces.UserDataAccessInterface;

import java.util.List;
import java.util.Objects;

public class UserDataAccess implements UserDataAccessInterface {

    private final List<User> users = List.of(
            new User("dev@jonghoonpark.com", "박종훈"),
            new User("thanos@jonghoonpark.com", "타노스"),
            new User("joker@jonghoonpark.com", "조커")
    );

    @Override
    public User fetchDataFromDatabase(String userEmail) {
        return Objects.requireNonNull(users.stream().filter((user) -> user.getEmail().equals(userEmail)).findFirst().orElse(null));
    }
}
