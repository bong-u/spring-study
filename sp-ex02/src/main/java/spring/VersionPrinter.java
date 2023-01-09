package spring;

public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public VersionPrinter(int majorVersion, int minorVersion) {
		this.majorVersion = majorVersion;
		this.minorVersion = minorVersion;
	}
	
	public void print() {
		System.out.printf("Version of this program is %d.%d\n\n",
				majorVersion, minorVersion);
	}
}
