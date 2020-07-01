package life.majiang.community.exception;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/12/10 21:49   戴宗明       1.0         None
 */


public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001, "你找的问题不在，要不要换个试试？"),
    TARGET_PARAM_NOT_FOUND(2002, "未选中任何评论或问题"),
    NO_LOGIN(2003, "当前未登录，请先登录"),
    SYS_ERROR(2004, "服务冒烟了，要不然稍后再试试！！！"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "你操作的评论不存在，要不要换个试试"),
    CONTENT_IS_EMPTY(2007, "输入内容不能为空"),
    READ_NOTIFICATION_FAIL(2008, "度别人的信息"),
    NOTIFICATION_NOT_FOUND(2009, "消息飞走了"),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;


    CustomizeErrorCode(Integer code, String message) {

        this.message = message;
        this.code = code;
    }
}
