package cn.wenhe9.yeb.server.exception;

import cn.wenhe9.yeb.server.result.ResultResponse;
import cn.wenhe9.yeb.server.result.ResultResponseEnum;
import lombok.Getter;

@Getter
public class YebException extends RuntimeException{
    private ResultResponse<Void> resultResponse;
 
    public YebException(ResultResponse<Void> resultResponse) {
        this.resultResponse = resultResponse;
    }
 
    public YebException(ResultResponseEnum responseEnum) {
        this.resultResponse = ResultResponse.build(null, responseEnum);
    }
}