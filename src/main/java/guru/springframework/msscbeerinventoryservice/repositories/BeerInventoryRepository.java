package guru.springframework.msscbeerinventoryservice.repositories;

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllBeersById(UUID beerId);

    List<BeerInventory> findAllByUpc(String upc);
}
