package com.gzw.auth.aliyun.model;

/**
 * Created by qzj on 2018/1/12
 */

import com.aliyuncs.AcsResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import com.gzw.auth.aliyun.transform.SendSmsResponseUnmarshaller;

public class SendSmsResponse extends AcsResponse {
    private String requestId;
    private String bizId;
    private String code;
    private String message;

    public SendSmsResponse() {
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SendSmsResponse getInstance(UnmarshallerContext context) {
        return SendSmsResponseUnmarshaller.unmarshall(this, context);
    }
}
