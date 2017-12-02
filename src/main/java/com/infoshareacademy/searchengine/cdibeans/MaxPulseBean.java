package com.infoshareacademy.searchengine.cdibeans;

import javax.enterprise.context.RequestScoped;

@RequestScoped //dziala tylko przy danym requescie
public class MaxPulseBean implements MaxPulse {

    @Override
    public double calculateMacPulseForMen(int age) {
        return 202 - (0.55 * age);
    }

    @Override
    public double calculateMacPulseForWoman(int age){
        return 216 - (1.09 * age);
    }

}
