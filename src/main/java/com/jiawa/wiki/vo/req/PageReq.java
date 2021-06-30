package com.jiawa.wiki.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author yuu
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageReq {
    @NotNull(message = "页码不能为空")
    private int page;
    @NotNull(message = "每页条数不能为空")
    @Max(value = 1000,message = "每页条数不能超过1000")
    private int size;
}
