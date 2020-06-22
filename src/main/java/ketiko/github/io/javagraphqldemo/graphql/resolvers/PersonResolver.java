package ketiko.github.io.javagraphqldemo.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import ketiko.github.io.javagraphqldemo.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonResolver implements GraphQLResolver<Person> {
  public String getId(Person person) {
    return person.getId();
  }

  public String getName(Person person) {
    return person.getName();
  }
}
