package model.loans;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import model.members.Member;

public class Loan {
  
  private UUID id;

  private Member member;
  
  private List<LoanItem> loanItems;

  private LocalDate loanDate;
  private LocalDate dueDate;
  private LocalDate returnDate;
}
