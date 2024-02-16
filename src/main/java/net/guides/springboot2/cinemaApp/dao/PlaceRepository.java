package net.guides.springboot2.cinemaApp.dao;
import net.guides.springboot2.cinemaApp.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlaceRepository extends JpaRepository<Place, Long> {
}