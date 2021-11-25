package guru.springframework.msscbeerinventoryservice.services;

import guru.springframework.brewery.model.BeerOrderDto;

public interface AllocateService {

    Boolean allocateOrder(BeerOrderDto beerOrderDto);

    void deallocateOrder(BeerOrderDto beerOrderDto);
}
