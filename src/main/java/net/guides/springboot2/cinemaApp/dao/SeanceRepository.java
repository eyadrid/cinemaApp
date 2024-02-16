package net.guides.springboot2.cinemaApp.dao;
import net.guides.springboot2.cinemaApp.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SeanceRepository extends JpaRepository<Seance, Long> {
}