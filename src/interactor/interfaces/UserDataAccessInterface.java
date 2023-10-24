package interactor.interfaces;

import entities.User;

public interface UserDataAccessInterface {
    User fetchDataFromDatabase(String email);
}
