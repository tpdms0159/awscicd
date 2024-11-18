package naver.tpdms0159.awscicd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {
    @RequestMapping("/")
    public String index() {
        return "안녕하세요";
    }
}
