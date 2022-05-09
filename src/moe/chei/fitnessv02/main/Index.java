package moe.chei.fitnessv02.main;

import moe.chei.fitnessv02.service.FitnessService;

public class Index {
    public static void main(String[] args) {
        final int MAX_MEMBER = 5;
        FitnessService service = new FitnessService(MAX_MEMBER);
    }
}
