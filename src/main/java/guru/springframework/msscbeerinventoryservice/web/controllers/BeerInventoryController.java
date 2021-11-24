package guru.springframework.msscbeerinventoryservice.web.controllers;

import guru.springframework.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import guru.springframework.msscbeerinventoryservice.web.mappers.BeerInventoryMapper;
import guru.springframework.brewery.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BeerInventoryController {

    private final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper beerInventoryMapper;

    @GetMapping("api/v1/beer/{beerId}/inventory")
    List<BeerInventoryDto> listBeersById(@PathVariable("beerId") UUID beerId) {
        log.debug("Finding Inventory of beerId " + beerId);

        return beerInventoryRepository.findAllBeersById(beerId)
                .stream()
                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
                .collect(Collectors.toList());
    }
}
