package be.smal.games.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(access = AccessLevel.PUBLIC)
public class Category {

    private Long id;
    private String category_name;

    @Override
    public String toString() {
        return "Category name: "+this.category_name;
    }
}
