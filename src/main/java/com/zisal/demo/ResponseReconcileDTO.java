package com.zisal.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 7/18/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */

public class ResponseReconcileDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -2541069964693404397L;

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("result")
    private String result;

    @JsonProperty("message")
    private String message;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseReconcileDTO{" +
                "timestamp='" + timestamp + '\'' +
                ", result='" + result + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
