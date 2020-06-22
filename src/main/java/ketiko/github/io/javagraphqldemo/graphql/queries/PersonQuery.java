package ketiko.github.io.javagraphqldemo.graphql.queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import ketiko.github.io.javagraphqldemo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonQuery implements GraphQLQueryResolver {
  public Person getPerson(String id) {
    return new Person(id, "Phil");
  }
}
