package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/11/13 20:50   戴宗明       1.0         None
 */

@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private Long gmtCreat;
    private Long gmtModified;
    private Long creator;
    private Integer commentCount;
    private Integer viewCount;
    private Integer likeCount;
    private String tag;
    private User user;
}
