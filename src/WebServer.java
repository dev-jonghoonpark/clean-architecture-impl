import controller.UserController;
import dataaccess.UserDataAccess;
import dataaccess.interfaces.UserDataAccessInterface;
import dto.OutputData;
import interactor.UserUseCaseInteractor;
import presenter.UserPresenter;
import presenter.interfaces.OutputBoundary;

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