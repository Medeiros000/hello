package com.hello.controller;

import com.hello.view.MsgView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
    @GetMapping("/msg")
    public String msg() {
        StringBuilder sb = new StringBuilder();
        MsgView mv = new MsgView();
        sb.append(mv.dom(
                mv.head("Hello, World!"),
                mv.body(mv.div("container", mv.h1("text-center", "Hello, World!")))));
        return sb.toString();
    }
}
