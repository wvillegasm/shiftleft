package demo.pattern.builder.initialaproaching;

public class Computer {
	// require parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(Builder builder) {
		super();
		// Required
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		
		//Optional
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM
				+ ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}

	// Builder class
	public static class Builder {
		// require parameters
		private final String HDD;
		private final String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public Builder(String hDD, String rAM) {
			super();
			this.HDD = hDD;
			this.RAM = rAM;
		}

		public Computer build() {
			return new Computer(this);
		}

		public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

	}

}
