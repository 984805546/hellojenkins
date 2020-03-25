package com.fs.hellojenkins;/**
 * @author: fs
 * @create: 2020/03/25 12:25
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program hellojenkins
 * @description:
 * @author: fs
 * @create: 2020/03/25 12:25
 */
@RestController
public class IndexController {
    @RequestMapping("/index1")
    public String index() {
        return "hello";
    }
}
