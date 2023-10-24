package presenter;

import dto.OutputData;
import interactor.interfaces.OutputBoundary;

public class UserPresenter implements OutputBoundary {
    @Override
    public void present(OutputData outputData) {
        System.out.println(outputData.getEmail());
    }
}
