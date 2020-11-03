package com.vehucule.demo.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class voiture  extends Vehicule{

    private int NbPlaces;

}
