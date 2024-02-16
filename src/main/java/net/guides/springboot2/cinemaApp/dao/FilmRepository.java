package net.guides.springboot2.cinemaApp.dao;
import net.guides.springboot2.cinemaApp.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FilmRepository extends JpaRepository<Film, Long> {
}