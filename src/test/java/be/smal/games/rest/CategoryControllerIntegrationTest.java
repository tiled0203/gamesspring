package be.smal.games.rest;


import be.smal.games.GamesApplication;
import be.smal.games.domain.Category;
import be.smal.games.domaindto.CategoryDTO;
import be.smal.games.services.CategoryService;
import javassist.NotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GamesApplication.class)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class CategoryControllerIntegrationTest {

    @Autowired
    CategoryController categoryController;

    @Autowired
    CategoryService categoryService;

    private Category newCategory;

    //todo   trying to reset the auto increment jpa is applying as for my db not to have a huge gap in id numbers all of a sudden
/*
    @After
    public  void resetAutoIncrement() {
        Query query = entityManager.createNativeQuery("ALTER TABLE category AUTO_INCREMENT = 1");
        query.executeUpdate();
    }
*/
    @Before
    public void setUp() throws Exception {
        CategoryDTO categoryDTO = new CategoryDTO("testName");
        newCategory = categoryController.saveCategory(categoryDTO);
    }

    // try to avoid creating test that does multiple things
    @Test
    public void checkCategoryName() {
        Assert.assertEquals("testName", newCategory.getCategory_name());
    }

    @Test
    public void findById() throws NotFoundException {
        Assert.assertNotNull(categoryService.findById(newCategory.getId()));
    }

    @Test
    public void deleteCategory() throws NotFoundException {
        int countAfterAdding = categoryService.findAll().size();
        categoryController.remove(newCategory.getId());
        int countAfterDeleting = categoryService.findAll().size();
        Assert.assertEquals(countAfterAdding, countAfterDeleting + 1);
        Assert.assertThrows(NotFoundException.class, () -> categoryService.findById(newCategory.getId()));
    }

}
