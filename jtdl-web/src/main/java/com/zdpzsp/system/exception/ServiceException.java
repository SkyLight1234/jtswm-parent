package com.zdpzsp.system.exception;

import com.zdpzsp.frame.ResultCode;

/**
 * Created by xiaxia on 2015/12/2 .
 */
public class ServiceException extends Exception {
    private Integer code;
    private String message;
    public ServiceException(int code, String message) {
        super(message);
        this.code=code;
        this.message=message;
    }

    public ServiceException(ResultCode resultCode) {
        super(resultCode.getMessage());
        this.code=resultCode.getCode();
        this.message=resultCode.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
