package life.majiang.community.enums;

import life.majiang.community.model.Question;

import java.util.TreeMap;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/12/19 22:01   戴宗明       1.0         None
 */


public enum  CommentTypeEnums {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnums(Integer type) {
        this.type = type;
    }

    public static boolean isExist(Integer type) {
        for (CommentTypeEnums commentTypeEnum : CommentTypeEnums.values()) {
            if (commentTypeEnum.getType() == type) {
                return true;
            }
        }
        return false;
    }

}
