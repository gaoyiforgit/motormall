package com.rimi.motormall.commons;

import java.io.Serializable;

/**
 * 一般返回类型code和msg
 *
 * @author Administrator
 * @date 2019-04-12 16:13
 */
// 实现序列化

public class ResultVo implements Result, Serializable {

    private int code;

    private String msg;

    public ResultVo() {
    }



    public ResultVo(ResultCode resultCode){
        this.code=resultCode.getCode();
        this.msg=resultCode.getMsg();
    }

    /**
     * 成功
     * @return
     */
    public static Result success(){
        return new ResultVo(ResultCode.SUCCESS);

    }

    /**
     * 失败
     * @return
     */
    public static Result failure(){
        return new ResultVo(ResultCode.FAILURE);

    }

    public static Result of(ResultCode resultCode){
        return new ResultVo(resultCode);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
