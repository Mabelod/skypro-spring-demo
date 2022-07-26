package pro.sky.skyprospringdemo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospringdemo.domain.Person;
import pro.sky.skyprospringdemo.service.PersonService;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person/by-passport")
    public String getPersonInfo(@RequestParam("passport") String passport) {
        return personService.getPersonByPassport(passport);
    }

    @GetMapping("/person/add")
    public String addPerson(@RequestParam("name") String name,
                            @RequestParam("surname") String surname,
                            @RequestParam("passport") String passport,
                            @RequestParam("profession") Integer profession) {
        Person person = new Person(
                name,
                surname,
                passport,
                profession
        );
        personService.addPerson(person);
        return "Person added";
    }
    @GetMapping("/person/profession/add")
    public String addProfession(@RequestParam("passport") String passport,
                                @RequestParam("profession") Integer profession) {
        personService.addProfession(passport, profession);
        return "Профессия успешно добавлена";
    }

}
