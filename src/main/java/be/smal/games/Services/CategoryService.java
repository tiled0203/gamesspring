package be.smal.games.Services;

import be.smal.games.domain.Category;
import be.smal.games.domaindto.CategoryDTO;
import be.smal.games.repositories.CategoryRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;


    public List<Category> findAll() {
        List<Category> categories = categoryRepository.findAll();
        return  categories;
    }

    public Category save(CategoryDTO categoryDTO) {
        Category category = new ModelMapper().map(categoryDTO,Category.class);
        return categoryRepository.save(category);
    }

    public void remove(int id) {
        categoryRepository.delete(this.findById(id));
    }

    public Category findById(int id) {
       Optional<Category> category = categoryRepository.findById(id);
       if (category.isPresent()){
           return category.get();
       }
       throw new NullPointerException("Category not found");
    }
}
