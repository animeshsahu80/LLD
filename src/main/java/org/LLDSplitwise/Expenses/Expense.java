package org.LLDSplitwise.Expenses;


import org.LLDSplitwise.Split.Split;
import org.LLDSplitwise.User.User;

import java.util.ArrayList;
import java.util.List;

public class Expense {
    double expenseAmount;
    String expenseId;
    String description;
    User paidByUser;
    ExpenseSplitType splitType;
    List<Split> splitDetails = new ArrayList<>();
    public Expense(String expenseId, double expenseAmount, String description,
                   User paidByUser, ExpenseSplitType splitType, List<Split> splitDetails) {

        this.expenseId = expenseId;
        this.expenseAmount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splitDetails.addAll(splitDetails);

    }


}

