package com.fuad.springmongodb.service;

import com.fuad.springmongodb.model.Expense;

import java.util.List;

public interface ExpenseService {
    void addExpense(Expense expense);
    void updateExpense(Expense expense);
    List<Expense> getAllExpenses();
    Expense getExpenseByName(String name);
    void deleteExpense(String id);
}
