package be.smal.games.Services;

import be.smal.games.domain.Category;
import be.smal.games.domaindto.CategoryDTO;
import be.smal.games.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    public List<Category> findAll() {
        List<Category> categories = categoryRepository.findAll();
        categories.stream().forEach(System.out::print);
        return  categories;
    }

    public void save(CategoryDTO categoryDTO) {
        Category category = Category.builder().category_name(categoryDTO.getName()).build();
        categoryRepository.save(category);
    }
}
