package br.com.alura.challenges.model;

import java.util.List;

public class Avaliation<T> {
    private T item;
    private Double rating;
    private String note;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Rating must be between 0 and 10!");
        }
        this.rating = rating;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public static <T> double calculateAvarageRating(List<Avaliation<T>> avaliation) {
        if (avaliation.isEmpty()) {
            throw new IllegalArgumentException("The list is empty.");
        }
        double sum = 0;
        for (Avaliation<T> avaliacao : avaliation) {
            sum += avaliacao.getRating();
        }
        return sum / avaliation.size();
    }

    @Override
    public String toString() {
        return "Avaliation{" +
                "item=" + item +
                ", rating=" + rating +
                ", note='" + note + '\'' +
                '}';
    }
}
