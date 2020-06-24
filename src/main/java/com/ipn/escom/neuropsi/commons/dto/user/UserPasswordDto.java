package com.ipn.escom.neuropsi.commons.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserPasswordDto implements Serializable {
    private static final long serialVersionUID = -1039430252396989972L;
    private String password;
    private String username;
    private String newPassword;
}
