package demo.pattern.builder.initialaproaching;

public class ComputerBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer c = new Computer.Builder("500GB", "8GB")
				.setBluetoothEnabled(true).build();
		System.out.println(c);

		c = new Computer.Builder("200GB", "4GB").build();
		System.out.println(c);

		c = new Computer.Builder("1T", "32GB")
				.setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		
		System.out.println(c);
	}

}
