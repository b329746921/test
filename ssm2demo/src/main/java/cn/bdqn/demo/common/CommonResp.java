package cn.bdqn.demo.common;

/**
 *
 **/
public class CommonResp<T> {
    private String code;
    private String msg;
    private String redirectUrl;
    private T data;

    public static <K> CommonResp<K> getSuccessResp(K data) {
        CommonResp resp = new CommonResp("0000", "成功");
        resp.setData(data);
        return resp;
    }

    public static <K> CommonResp<K> getSuccessResp(K data, String redirectUrl) {
        CommonResp resp = new CommonResp("0000", "成功");
        resp.setData(data);
        resp.setRedirectUrl(redirectUrl);
        return resp;
    }

    public static CommonResp getFailedResp() {
        CommonResp resp = new CommonResp("9999", "系统异常");
        return resp;
    }

    public CommonResp(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommonResp() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
