package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Contact :   dzm_1995@163.com
 * <p>
 * Modify Time       Author     Version    Desciption
 * ------------      -------    --------    -----------
 * 2019/10/30 9:28   戴宗明       1.0         None
 */

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {

        return "index";
    }
}
