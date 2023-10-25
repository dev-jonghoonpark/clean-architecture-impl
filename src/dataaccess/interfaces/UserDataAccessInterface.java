package dataaccess.interfaces;

import entities.User;

public interface UserDataAccessInterface {
    User fetchDataFromDatabase(String email);
}
