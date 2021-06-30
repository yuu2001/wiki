package com.jiawa.wiki.vo.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author yuu
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EBookSaveVo {
    private Long id;
    @NotNull(message = "名称不能为空")
    private String name;

    private Long category1Id;

    private Long category2Id;

    private String description;

    private String cover;

    private Integer docCount;

    private Integer viewCount;

    private Integer voteCount;
}
