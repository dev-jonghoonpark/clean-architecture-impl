package controller.interfaces;

import dto.OutputData;

public interface InputBoundary {
    OutputData findUsername(String email);
}
