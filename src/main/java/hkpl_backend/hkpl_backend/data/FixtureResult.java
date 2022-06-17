package hkpl_backend.hkpl_backend.data;

import java.util.List;

public class FixtureResult {
    private Integer success;
    private List<Object> result;

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public List<Object> getResult() {
        return result;
    }

    public void setResult(List<Object> result) {
        this.result = result;
    }
}

