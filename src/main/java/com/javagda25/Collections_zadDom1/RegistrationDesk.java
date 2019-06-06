package com.javagda25.Collections_zadDom1;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor

public class RegistrationDesk {

//    public RegistrationDesk(Patient patient, String data, String imieLekarza, String nazwiskoLekarza, long idWizyty, double cenaWizyty) {
//        super(patient, data, imieLekarza, nazwiskoLekarza, idWizyty, cenaWizyty);
//    }

    RegistrationRequest registrationRequest = new RegistrationRequest();

    public long register(RegistrationRequest request) {
        System.out.println(request.getIdWizyty());
        return request.getIdWizyty();
    }

    public RegistrationRequest getRequest(long requestId, List<RegistrationRequest> registrationRequests) {
        requestId = registrationRequest.getIdWizyty();
        for (RegistrationRequest a : registrationRequests) {
            if (a.getIdWizyty() == requestId) {
                return a;
            } else {
                System.out.println("Nie ma tekiego ID w rejestrze");
            }
        }
        return null;
    }
}
