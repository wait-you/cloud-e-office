package cn.wenhe9.yeb.server.result;

import lombok.*;

/**
 * @author DuJinliang
 * 2022/9/22
 * 统一返回值类型
 */

@Getter
@Setter
public class ResultResponse<T> {
    private Integer code;

    private T data;

    private String message;

    public ResultResponse() {

    }

    protected static <T> ResultResponse<T> build(T data) {
        ResultResponse<T> resultResponse = new ResultResponse<>();
        resultResponse.setData(data);
        return resultResponse;
    }

    public static <T> ResultResponse<T> build(T data, ResultResponseEnum resultResponseEnum) {
        ResultResponse<T> resultResponse = build(data);
        resultResponse.setCode(resultResponseEnum.getCode());
        resultResponse.setMessage(resultResponseEnum.getMessage());
        return resultResponse;
    }

    public static <T> ResultResponse<T> success() {
        ResultResponse<T> resultResponse = build(null, ResultResponseEnum.SUCCESS);
        return resultResponse;
    }

    public static <T> ResultResponse<T> success(T data) {
        ResultResponse<T> resultResponse = build(data, ResultResponseEnum.SUCCESS);
        return resultResponse;
    }

    public static <T> ResultResponse<T> fail(T data){
        ResultResponse<T> resultResponse = build(data, ResultResponseEnum.FAIL);
        return resultResponse;
    }

    public static <T> ResultResponse<T> fail(){
        ResultResponse<T> resultResponse = build(null, ResultResponseEnum.FAIL);
        return resultResponse;
    }

    public ResultResponse<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public ResultResponse<T> message(String message) {
        this.message = message;
        return this;
    }
}
