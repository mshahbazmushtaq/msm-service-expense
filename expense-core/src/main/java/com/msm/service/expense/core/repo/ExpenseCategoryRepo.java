package com.msm.service.expense.core.repo;


import com.msm.service.expense.core.entity.ExpenseCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExpenseCategoryRepo extends JpaRepository<ExpenseCategoryEntity, Integer> {

    Optional<ExpenseCategoryEntity> findByExpenseCategoryTitle(String expenseCategoryTitle);

    Optional<List<ExpenseCategoryEntity>> findByExpenseCategoryIdIn(List<Integer> ids);

}
