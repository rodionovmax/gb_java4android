package lesson8.part2;

public enum Color {
    BLACK("cherniy"), WHITE("beliy"), GREY("seriy");

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }
}
