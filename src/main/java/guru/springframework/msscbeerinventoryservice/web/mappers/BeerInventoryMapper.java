package guru.springframework.msscbeerinventoryservice.web.mappers;

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.brewery.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerInventoryMapper {

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);
}
