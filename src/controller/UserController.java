package controller;

import dto.OutputData;
import entities.User;
import interactor.UserUseCaseInteractor;
import interactor.interfaces.InputBoundary;

public class UserController implements InputBoundary {
    private UserUseCaseInteractor userUseCaseInteractor;

    public UserController(UserUseCaseInteractor userUseCaseInteractor) {
        this.userUseCaseInteractor = userUseCaseInteractor;
    }

    @Override
    public OutputData findUsername(String email) {
        User user = userUseCaseInteractor.fetchDataFromDatabase(email);

        OutputData outputData = new OutputData(user);

        return outputData;
    }
}
