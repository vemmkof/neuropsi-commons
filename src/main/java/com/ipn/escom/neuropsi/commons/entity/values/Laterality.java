package com.ipn.escom.neuropsi.commons.entity.values;

public enum Laterality {
    LEFT_HANDED("LEFT_HANDED"), RIGHT_HANDED("RIGHT_HANDED"), AMBIDEXTROUS("AMBIDEXTROUS");

    private final String lateralityValue;

    Laterality(String laterality) {
        lateralityValue = laterality;
    }
    
    @Override
    public String toString() {
        return lateralityValue;
    }
}
