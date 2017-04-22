package org.cong.x.project.web.util.response;

import lombok.Data;
import org.cong.x.project.web.util.enums.CodeEnum;

/**
 * Created by liaojuncong on 05/10/2016.
 */
@Data
public class DataRes<T> {

    private Integer code;

    private String message;

    public void setCodeEnum(CodeEnum code) {
        this.code = code.getCode();
        this.message = code.getDesc();
    }

    private T data;
}
