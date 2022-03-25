public enum y_Zoo {
    DOG("Собака"), CAT("Кошка"), FROG("лягушка");

    private String translation;

    y_Zoo(String transtation) {
        this.translation = transtation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "Перевод на русский язык " + translation;
    }
}
