package com.zisal.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created on 7/18/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class RequestReconcileDTO implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -4784801429218818057L;

    @JsonProperty("body")
    private RequestReconcileContentDTO body;

    public RequestReconcileContentDTO getBody() {
        return body;
    }

    public void setBody(RequestReconcileContentDTO body) {
        this.body = body;
    }
}
