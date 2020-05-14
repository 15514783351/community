package life.majiang.community.dto;

import lombok.Data;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/12/17 20:21   戴宗明       1.0         None
 */

@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
