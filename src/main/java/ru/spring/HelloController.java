package ru.spring;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller // Объявить как контроллер
public class HelloController {


    @GetMapping( "/hello") // Обрабатывать запросы на получение
    // главной страницы
    public String sayHello() {

        return "index"; // Вернуть имя представления
    }
}