package controller;

import controller.interfaces.InputBoundary;
import dto.OutputData;
import entities.User;
import interactor.UserUseCaseInteractor;

public class UserController implements InputBoundary {
    private final UserUseCaseInteractor userUseCaseInteractor;

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
