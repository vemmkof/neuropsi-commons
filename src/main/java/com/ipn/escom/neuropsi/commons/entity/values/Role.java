package com.ipn.escom.neuropsi.commons.entity.values;

public enum Role {
    ADMINISTRATOR("ADMINISTRATOR"), SPECIALIST("SPECIALIST"), PATIENT("PATIENT");

    String roleValue;

    Role(String role) {
        roleValue = role;
    }

}
