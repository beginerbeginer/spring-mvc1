package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;

@Controller
public class HomeControler {
	
	//@ModelArttributeを使うと、リクエストと位置するものがモデルへ流し込まれる。（データバインディング）
	//解析や変換に対処する必要がなくなる。	
	
	@GetMapping("/form")
	private String readForm(@ModelAttribute User user /*, Model model */) {
		//model.addAttribute("user, user); モデルに登録する必要がありません
		return "form";
	}
	
	@PostMapping("/form")
	private String confirm(@ModelAttribute User user) {
		return "confirm";
	}

}
