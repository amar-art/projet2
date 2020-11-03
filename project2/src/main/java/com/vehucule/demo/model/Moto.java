package com.vehucule.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M")
public class Moto extends Vehicule {

    private  double cylindree;
}
