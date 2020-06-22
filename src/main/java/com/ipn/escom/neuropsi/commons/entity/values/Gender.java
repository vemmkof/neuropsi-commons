package com.ipn.escom.neuropsi.commons.entity.values;

public enum Gender {
    MALE("MALE"), FEMALE("FEMALE");

    private final String genderValue;

    Gender(String gender) {
        genderValue = gender;
    }

    @Override
    public String toString() {
        return genderValue;
    }
}
