package com.codurance.ocp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PayeServiceShould {

    private static final int BONUS = 100;
    private static final int SALARY = 1000;

    @Test
    public void not_add_bonus_to_the_engineer_pay_amount() {
        PayeService payeService = new PayeService();
        Employee employee = new Engineer(SALARY);
        assertThat(payeService.payAmount(employee))
                .isEqualTo(SALARY);
    }


   @Test
    public void add_bonus_to_the_manager_pay_amount() {
       PayeService payeService = new PayeService();
        Employee employee = new Manager(SALARY, BONUS);
        assertThat(payeService.payAmount(employee))
                .isEqualTo(SALARY+BONUS);
    }
}