package com.jiawa.wiki.vo.resp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author yuu
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRespVo<T> {
    private Long total;
    private List<T> list;
}
