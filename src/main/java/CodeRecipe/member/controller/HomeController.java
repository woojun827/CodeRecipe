package CodeRecipe.member.controller;
// 눈에 보이는 결과물이 있어야 더 이해하기 쉽다! 일단 해보고 공부하는 것도 좋다/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본 페이지를 요청하는 메서드.
    @GetMapping("/")
    public String index(){
        return "index"; // 그냥 기본 요청이 오면, index라는 html 파일을 띄우겠다.
        // templates 폴더의 index.html을 찾아감
        // spring의 view resolver라는 녀석이 resources의 templates를 찾아가준다.

        // 일단 유저의 요청은 무조건 controller에서 받아들인다.
    }

}
