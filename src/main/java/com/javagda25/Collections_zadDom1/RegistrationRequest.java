package com.javagda25.Collections_zadDom1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class RegistrationRequest {
    private Patient patient;
    private String data;
    private String imieLekarza;
    private String nazwiskoLekarza;
    private long idWizyty;
    private double cenaWizyty;

}
