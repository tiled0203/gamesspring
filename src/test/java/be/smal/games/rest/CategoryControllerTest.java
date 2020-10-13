package be.smal.games.rest;


import be.smal.games.domaindto.CategoryDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class CategoryControllerTest {

    @Autowired
    CategoryController categoryController;

    @Test
    void addCategoryTest(){
        int before = categoryController.categories().size();
        CategoryDTO categoryDTO = new CategoryDTO("testName");
        categoryController.saveCategory(categoryDTO);
        int after = categoryController.categories().size();

        Assert.isTrue(before +1  == after, "the list should be 1 smaller before we added a category");
    }
}
