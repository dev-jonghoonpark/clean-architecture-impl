package interactor;

import entities.User;
import interactor.interfaces.UserDataAccessInterface;

public class UserUseCaseInteractor {
    private final UserDataAccessInterface userDataAccess;

    public UserUseCaseInteractor(UserDataAccessInterface userDataAccess) {
        this.userDataAccess = userDataAccess;
    }

    public User fetchDataFromDatabase(String email) {
        return userDataAccess.fetchDataFromDatabase(email);
    }
}
