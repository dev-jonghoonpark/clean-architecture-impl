package presenter;

import dto.OutputData;
import presenter.interfaces.OutputBoundary;

public class UserPresenter implements OutputBoundary {
    @Override
    public void present(OutputData outputData) {
        System.out.println(outputData.getEmail());
    }
}
