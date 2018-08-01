package spring.web.mvc.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.web.mvc.demo.domain.Category;
import spring.web.mvc.demo.repositories.CategoryRepository;

import java.util.Optional;

@Controller
public class IndexController {

    CategoryRepository categoryRepository;

    public IndexController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(){

        Optional<Category> category = categoryRepository.findByDescription("some string")

        return "index";
    }
}
