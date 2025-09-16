package CodeRecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    // 회원가입 페이지 출력 요청
    @GetMapping("/member/save") // 링크를 클릭하는 것은 get http 메서드
    public String saveForm(){
        return "save";  // save html을 보여주겠다. templates에서.
    }

    @PostMapping("/member/save")
    public String save(@RequestParam("memberEmail") String memberEmail,
                       @RequestParam("memberPassword") String memberPassword,
                       @RequestParam("memberName") String memberName){
        System.out.println("MemberController.save");
        System.out.println("memberEmail = " + memberEmail);
        return "index";
        // 브랜치 테스트
    }
}
