package be.smal.games.rest;

import be.smal.games.Services.CategoryService;
import be.smal.games.domain.Category;
import be.smal.games.domaindto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @GetMapping
    public List<Category> categories(){
        return categoryService.findAll();
    }

    //trying to get this to work
    @PostMapping(path = "")
    public Category saveCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.save(categoryDTO);
    }

    public void remove(int after) {
        categoryService.remove(after);
    }
}
