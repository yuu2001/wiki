package com.jiawa.wiki.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yuu
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EBookVo extends PageReq {
    private Long id;
    private String name;
}
