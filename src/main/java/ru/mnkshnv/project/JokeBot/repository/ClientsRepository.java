package ru.mnkshnv.project.JokeBot.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ru.mnkshnv.project.JokeBot.model.Clients;


public interface ClientsRepository extends CrudRepository<Clients, Long> {
    Optional<Clients> findByUsername(String username);
}