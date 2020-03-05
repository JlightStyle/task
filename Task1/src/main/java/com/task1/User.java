package com.task1;

class User {
    private long id;
    private Vacancy vacancy;

    public User(long id, String vacancyName) {
        this.id = id;
        this.vacancy = new Vacancy(vacancyName);
    }

    String getVacancy() {
        return vacancy.getVacancy();
    }

    long getId() {
        return id;
    }
}
