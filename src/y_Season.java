public enum y_Season {
    SUMMER(35), WINTER(-30), AUUTMN(10), SPRING(20);
    // Объекты класса season

    private int temperature;

    y_Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}