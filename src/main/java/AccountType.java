public enum AccountType {
    FREE(0),
    PRO(1);

    private final int value;

    AccountType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}
