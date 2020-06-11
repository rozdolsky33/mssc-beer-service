package com.arwest.msscbeerservice.web.model.events;

import com.arwest.msscbeerservice.web.model.BeerDto;
import lombok.NoArgsConstructor;


@NoArgsConstructor
public class NewInventoryEvent extends BeerEvent {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
