package model.members;

import java.util.List;
import java.util.UUID;

import model.loans.Loan;

public class Member {

    List<Loan> loans;

    private UUID id;
    private String name;
    private String email;
}
