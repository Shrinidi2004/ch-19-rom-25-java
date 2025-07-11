class BankingUser {
    static String accountHolder = "Suresh Reddy";
    static String accountType = "Savings";
    static long accountNumber = 123456789123L;
    static double balance = 42050.65;
    static boolean isKYCCompleted = true;

    public static String getAccountHolder() { return accountHolder; }
    public static String getAccountType() { return accountType; }
    public static long getAccountNumber() { return accountNumber; }
    public static double getBalance() { return balance; }
    public static boolean isKYCCompleted() { return isKYCCompleted; }
}

