package org.cong.x.project.web.util;

import com.github.pagehelper.Page;
import org.cong.x.project.web.util.response.PageRes;

import java.util.List;

/**
 * Created by liaojuncong on 05/10/2016.
 */
public class ConverterUtil {

    public static <T> PageRes<T> convertToPageInfoRes(List<T> list) {
        PageRes<T> res = new PageRes<T>();
        long total = ((Page) list).getTotal();
        res.setTotal(total);
        res.setList(list);

        return res;
    }
}
