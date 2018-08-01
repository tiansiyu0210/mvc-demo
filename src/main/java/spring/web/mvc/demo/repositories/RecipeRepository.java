package spring.web.mvc.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.web.mvc.demo.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
