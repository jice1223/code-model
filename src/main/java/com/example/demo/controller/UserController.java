package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.result.ResultVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {
//    @Autowired
//    private UserService userService;

    @PostMapping("/addUser")
    public ResultVO addUser(@RequestBody @Valid User user) {
        // 如果有参数校验失败，会将错误信息封装成对象组装在BindingResult里
//        for (ObjectError error : bindingResult.getAllErrors()) {
//            return error.getDefaultMessage();
//        }
        return new ResultVO(user);
    }
}
