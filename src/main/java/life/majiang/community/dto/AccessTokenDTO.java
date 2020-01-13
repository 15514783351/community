package life.majiang.community.dto;

import lombok.Data;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/10/31 15:39   戴宗明       1.0         None
 */

@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

//    public String getClient_id() {
//        return client_id;
//    }
//
//    public void setClient_id(String client_id) {
//        this.client_id = client_id;
//    }
//
//    public String getClient_secret() {
//        return client_secret;
//    }
//
//    public void setClient_secret(String client_secret) {
//        this.client_secret = client_secret;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public String getRedirect_uri() {
//        return redirect_uri;
//    }
//
//    public void setRedirect_uri(String redirect_uri) {
//        this.redirect_uri = redirect_uri;
//    }
//
//    public String getState() {
//        return state;
//    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
}
