package challenges.challangle02;

public class test {
	public static void main(String[] args) {
		bankAccount account = new bankAccount("John Doe", "1234567890");
		account.depositMoney(100);
		System.out.println(account);
		account.withdrawMoney(50);
		System.out.println(account);
	}
}
