package life.majiang.community.dto;

import life.majiang.community.model.User;
import lombok.Data;

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private User notifier;  // 通知的人
    private String outerTitle;  // 回复别人的题目名称
    private String type;
}
