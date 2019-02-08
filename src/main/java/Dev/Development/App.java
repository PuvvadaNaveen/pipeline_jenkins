package Dev.Development;

import Dev.Development.entity.savings;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {

			savings saving = new savings();
			saving.accountno = 101;
			saving.getBalance();

			saving.withdraw(00);

			System.out.println(" End");
		} catch (Exception e) {
			e.getMessage();

		}
		System.out.println("Done");
	}
}
