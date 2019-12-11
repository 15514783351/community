package life.majiang.community.dto;

import lombok.Data;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/10/31 18:55   戴宗明       1.0         None
 */

@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

    }

//    @Override
//    public String toString() {
//        return "GithubUser{" +
//                "name='" + name + '\'' +
//                ", id=" + id +
//                ", bio='" + bio + '\'' +
//                '}';
//    }
//}
