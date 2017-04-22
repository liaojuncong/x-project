package org.cong.x.project.web.util;


import org.cong.x.project.web.util.enums.CodeEnum;
import org.cong.x.project.web.util.response.DataRes;

/**
 * Created by liaojuncong on 05/10/2016.
 */
public abstract class ResUtil {

    public static <T> DataRes<T> render(T data, Integer code, String message) {
        DataRes<T> res = new DataRes<T>();
        res.setData(data);
        res.setCode(code);
        res.setMessage(message);
        return res;
    }

    public static <T> DataRes<T> render(T data, CodeEnum code) {
        return render(data, code.getCode(), code.getDesc());
    }

    public static <T> DataRes<T> renderSucc() {
        DataRes<T> response = new DataRes<T>();
        response.setCodeEnum(CodeEnum.SUCCEED_CODE);
        return response;
    }
    public static <T> DataRes<T> renderSucc(T data) {
        DataRes<T> response = new DataRes<T>();
        response.setData(data);
        response.setCodeEnum(CodeEnum.SUCCEED_CODE);
        return response;
    }
    public static <T> DataRes<T> renderSucc(T data, String message) {
        DataRes<T> response = new DataRes<T>();
        response.setData(data);
        response.setCodeEnum(CodeEnum.SUCCEED_CODE);
        response.setMessage(message);
        return response;
    }

    public static <T> DataRes<T> renderError(String message) {
        DataRes<T> response = new DataRes<T>();
        response.setCodeEnum(CodeEnum.ERROR_CODE);
        response.setMessage(message);
        return response;
    }
}
