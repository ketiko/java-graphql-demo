package ketiko.github.io.javagraphqldemo.graphql.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.List;
import ketiko.github.io.javagraphqldemo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PeopleQuery implements GraphQLQueryResolver {
  public List<Person> getPeople() {
    var personA = new Person("2", "Tom");
    var personB = new Person("3", "Bob");
    return List.of(personA, personB);
  }
}
