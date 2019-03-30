package com.elcio.workout5;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] WORKOUTS = {
            new Workout("Supino Reto", "trabalho a região do peitoral"),
            new Workout("Agachamento", "Trabalha a região das pernas")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
