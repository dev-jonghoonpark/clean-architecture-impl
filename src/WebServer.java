import controller.UserController;
import dataaccess.UserDataAccess;
import dto.OutputData;
import interactor.UserUseCaseInteractor;
import interactor.interfaces.OutputBoundary;
import interactor.interfaces.UserDataAccessInterface;
import presenter.UserPresenter;

public class WebServer {
    public static void main(String[] args) {
        UserDataAccessInterface dataAccess = new UserDataAccess();
        UserUseCaseInteractor userUseCaseInteractor = new UserUseCaseInteractor(dataAccess);
        UserController userController = new UserController(userUseCaseInteractor);
        OutputBoundary presenter = new UserPresenter();

        OutputData outputData = userController.findUsername("dev@jonghoonpark.com");
        presenter.present(outputData);
    }
}