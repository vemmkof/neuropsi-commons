package com.ipn.escom.neuropsi.commons.entity.values;

public enum Role {
    ADMINISTRATOR("ADMINISTRATOR"), SPECIALIST("SPECIALIST"), PATIENT("PATIENT");

    private final String roleValue;

    Role(String role) {
        roleValue = role;
    }

    @Override
    public String toString() {
        return roleValue;
    }
}
