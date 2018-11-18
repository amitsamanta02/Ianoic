package org.amit.invman.Ianoic.model;

import org.springframework.stereotype.Component;

@Component
public class ReturnMessage {
    private int rcCode;
    private String rsMessage;
    private String reasonCode;
    private String reasonMessage;

    public int getRcCode() {
        return rcCode;
    }

    public void setRcCode(int rcCode) {
        this.rcCode = rcCode;
    }

    public String getRsMessage() {
        return rsMessage;
    }

    public void setRsMessage(String rsMessage) {
        this.rsMessage = rsMessage;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonMessage() {
        return reasonMessage;
    }

    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }
}
