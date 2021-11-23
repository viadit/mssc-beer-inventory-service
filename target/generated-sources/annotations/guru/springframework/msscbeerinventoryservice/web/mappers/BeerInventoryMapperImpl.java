package guru.springframework.msscbeerinventoryservice.web.mappers;

import guru.springframework.msscbeerinventoryservice.domain.BeerInventory;
import guru.springframework.msscbeerinventoryservice.domain.BeerInventory.BeerInventoryBuilder;
import guru.springframework.msscbeerinventoryservice.web.models.BeerInventoryDto;
import guru.springframework.msscbeerinventoryservice.web.models.BeerInventoryDto.BeerInventoryDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-23T22:22:14+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDtoBuilder beerInventoryDto = BeerInventoryDto.builder();

        beerInventoryDto.id( beerInventory.getId() );
        beerInventoryDto.beerId( beerInventory.getBeerId() );
        beerInventoryDto.quantityOnHand( beerInventory.getQuantityOnHand() );

        return beerInventoryDto.build();
    }

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        BeerInventoryBuilder beerInventory = BeerInventory.builder();

        beerInventory.id( beerInventoryDTO.getId() );
        beerInventory.beerId( beerInventoryDTO.getBeerId() );
        beerInventory.quantityOnHand( beerInventoryDTO.getQuantityOnHand() );

        return beerInventory.build();
    }
}
