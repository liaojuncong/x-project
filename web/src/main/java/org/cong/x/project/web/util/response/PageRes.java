package org.cong.x.project.web.util.response;

import lombok.Data;

import java.util.List;

/**
 * Created by liaojuncong on 05/10/2016.
 */
@Data
public class PageRes<T> {

    private long total;

    private List<T> list;
}
