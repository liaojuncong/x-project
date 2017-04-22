package org.cong.x.project.web.util.enums;

import lombok.Getter;

/**
 * Created by liaojuncong on 05/10/2016.
 */
public enum CodeEnum {


    SUCCEED_CODE(0, "成功"),
    SESSION_TIMEOUT(1, "会话超时，请重新登录"),
    ERROR_CODE(-1,"系统错误")
    ;
    @Getter
    private int code;
    @Getter
    private String desc;

    CodeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
