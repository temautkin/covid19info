package com.artemoons.covid19info.dto;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.select.Elements;

import java.util.Objects;

@Getter
@Setter
public class Message {

    private Elements lastUpdateInformation;

    private Elements statisticNumbers;

    private Elements statisticDescriptions;

    private Long testsOverall;

    private Long infectedOverall;

    private Long infectedLastDay;

    private Long healedOverall;

    private Long deathsOverall;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(lastUpdateInformation, message.lastUpdateInformation) &&
                Objects.equals(statisticNumbers, message.statisticNumbers) &&
                Objects.equals(statisticDescriptions, message.statisticDescriptions) &&
                Objects.equals(testsOverall, message.testsOverall) &&
                Objects.equals(infectedOverall, message.infectedOverall) &&
                Objects.equals(infectedLastDay, message.infectedLastDay) &&
                Objects.equals(healedOverall, message.healedOverall) &&
                Objects.equals(deathsOverall, message.deathsOverall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastUpdateInformation, statisticNumbers, statisticDescriptions, testsOverall, infectedOverall, infectedLastDay, healedOverall, deathsOverall);
    }

    @Override
    public String toString() {
        return "Message{" +
                "lastUpdateInformation=" + lastUpdateInformation +
                ", statisticNumbers=" + statisticNumbers +
                ", statisticDescriptions=" + statisticDescriptions +
                ", testsOverall=" + testsOverall +
                ", infectedOverall=" + infectedOverall +
                ", infectedLastDay=" + infectedLastDay +
                ", healedOverall=" + healedOverall +
                ", deathsOverall=" + deathsOverall +
                '}';
    }
}
