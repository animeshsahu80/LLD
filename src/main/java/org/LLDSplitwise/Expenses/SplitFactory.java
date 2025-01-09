package org.LLDSplitwise.Expenses;

import org.LLDSplitwise.Split.EqualExpenseSplit;
import org.LLDSplitwise.Split.ExpenseSplit;
import org.LLDSplitwise.Split.PercentageExpenseSplit;
import org.LLDSplitwise.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}

