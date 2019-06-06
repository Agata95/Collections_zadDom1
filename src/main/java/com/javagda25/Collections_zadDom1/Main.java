package com.javagda25.Collections_zadDom1;

// Aplikacja do rejestracji klientów na wizyty u dentysty/ortodonty, oraz do prowadzenia dokumentacji pacjentów.
//
// stwórz klasę Patient, która będzie przechowywała dane osobowe pacjenta
// stwórz klasę RegistrationRequest, która będzie przechowywała szczegóły dotyczące danej wizyty, takie jak: pacjent,
// data, imię i nazwisko lekarza, do którego rezerwowana jest wizyta, cena wizyty i dodatkowe szczegóły oraz
// informacje o pacjencie (obiekt Patient)
// stwórz klasę RegistrationDesk, która będzie miała metodę:
// - register(RegistrationRequest request):long, zwracającą numer identyfikacyjny nowej wizyty
// - getRequest(long requestId):RegistrationRequest, zwracającą dane wizyty
// - getPatientInfo(long requestId):Patient, zwracającą dane osobowe pacjenta
// -* getPatientVisits(String name, String surname):List<RegistrationRequest> - zwracającą listę (wszystkich)
// wizyt podanego pacjenta.
// -* getPatientVisits(Patient patient):List<RegistrationRequest> - zwracającą listę (wszystkich) wizyt podanego
// pacjenta.
//
// Zadanie wykonaj na liście. Zadanie wymaga umiejętnosci przeszukiwania listy.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<RegistrationRequest> lista = new ArrayList<>();

        RegistrationRequest r1 = new RegistrationRequest(new Patient("Agata", "Weltrowska"), "11.10.2018", "Anna", "Adams", 12843L, 45.60);
        RegistrationRequest r2 = new RegistrationRequest(new Patient("Anna", "Nowak"), "11.03.2019", "Eryk", "Kac", 5432L, 60.90);
        RegistrationRequest r3 = new RegistrationRequest(new Patient("Zuzanna", "Nowakowska"), "14.05.2019", "Anna", "Adams", 8264L, 73.45);
        RegistrationRequest r4 = new RegistrationRequest(new Patient("Kazimierz", "Kot"), "22.12.2018", "Mateusz", "Złośliwy", 16428L, 145.30);
        RegistrationRequest r5 = new RegistrationRequest(new Patient("Korneliusz", "Retz"), "03.01.2019", "Kamila", "Banan", 65348L, 28.95);

        lista.add(r1);
        lista.add(r2);
        lista.add(r3);
        lista.add(r4);
        lista.add(r5);

        RegistrationDesk registrationDesk = new RegistrationDesk();

        registrationDesk.register(r1);
        System.out.println(registrationDesk.getRequest(5432L, lista));
    }
}
