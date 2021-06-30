package com.jiawa.wiki.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuu
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageReq {
    private int page;
    private int size;
}
