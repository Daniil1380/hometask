package main;

import classes.PensionFund;
import classes.TypeOfFund;

import java.util.ArrayList;
import java.util.List;

public class MainPensionFund {

    private static final int MAX_SIZE_OF_NAME = 15;

    public static void main(String[] args) {
        //2) Создать stream, который из всех пенсионных фондов оставляет
        // только государственные и название которых короче, чем 15 символов

        List<PensionFund> pensionFunds = new ArrayList<>();

        pensionFunds = pensionFunds
                .stream()
                .filter(pensionFund -> pensionFund.getType() != null && pensionFund.getType().equals(TypeOfFund.STATE))
                .filter(pensionFund -> pensionFund.getName() != null && pensionFund.getName().length() < MAX_SIZE_OF_NAME)
                .toList();
    }


}
