package ru.mnkshnv.project.JokeBot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mnkshnv.project.JokeBot.model.Jokes;

@Repository
public interface JokesRepository extends JpaRepository<Jokes, Long> {

}
