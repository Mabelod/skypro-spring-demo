package pro.sky.skyprospringdemo.service;

import pro.sky.skyprospringdemo.exceptions.BadPersonNumberException;

public interface PersonService {
    String getPerson(Integer number) throws BadPersonNumberException;
}
