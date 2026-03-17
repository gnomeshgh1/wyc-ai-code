package com.wyc.wycaicode.controller;

import com.wyc.wycaicode.common.BaseResponse;
import com.wyc.wycaicode.common.ResultUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {
    @PostMapping("/hello")
    public BaseResponse<String> example() {
        return ResultUtils.success("hello");
    }

}
