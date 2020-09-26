package com.ml.hyperledger.fabric.client.model;

/**
 * @author mengl
 */
public class FabricOperationResult {
    private boolean result;
    private String msg;

    public FabricOperationResult(String msg, boolean result) {
        this.msg = msg;
        this.result = result;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
