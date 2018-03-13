package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import util.WordToHtml;
import service.Word2HtmlServiceImp;

@Controller
public class IndexController {

    private Word2HtmlServiceImp clientService;



    @RequestMapping("/index")
    public String index() {
        return "test";
    }

    @RequestMapping("/word2Html")
    public void word2Html(){
        WordToHtml wordToHtml = new WordToHtml();
        wordToHtml.indexMethod();
    }
}
