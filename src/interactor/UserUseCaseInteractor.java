package interactor;

import dataaccess.interfaces.UserDataAccessInterface;
import entities.User;

public class UserUseCaseInteractor {
    private final UserDataAccessInterface userDataAccess;

    public UserUseCaseInteractor(UserDataAccessInterface userDataAccess) {
        this.userDataAccess = userDataAccess;
    }

    public User fetchDataFromDatabase(String email) {
        return userDataAccess.fetchDataFromDatabase(email);
    }
}
