package com.ipn.escom.neuropsi.commons.tools;

import com.ipn.escom.neuropsi.commons.entity.values.Gender;
import com.ipn.escom.neuropsi.commons.entity.values.Laterality;
import com.ipn.escom.neuropsi.commons.entity.values.Role;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EnumToList {

    public List<String> convertGenderToList() {
        return Arrays.asList(Gender.values()).stream()
                .map(gender -> gender.name())
                .collect(Collectors.toList());
    }

    public List<String> convertLateralityToList() {
        return Arrays.asList(Laterality.values()).stream()
                .map(laterality -> laterality.name())
                .collect(Collectors.toList());
    }

    public List<String> convertRoleToList() {
        return Arrays.asList(Role.values()).stream()
                .map(role -> role.name())
                .collect(Collectors.toList());
    }
}
