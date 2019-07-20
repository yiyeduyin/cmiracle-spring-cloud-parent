package com.cmiracle.springcloud.commonutil.exception;

/**
 * @Author: cmiracle
 * @Date: 2019/7/20 17 24
 * @Description:
 */
public class ServiceException extends RuntimeException {

    private int errcode = 0;

    private String errmsg;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public ServiceException(int errcode) {
        this.errcode = errcode;
    }
}
