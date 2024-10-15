package day8;

public class Chrome implements WebDriver {

	public static void main(String[] args) {
		Chrome obj = new Chrome();
		obj.closeBrowser();
		obj.startApplication();
		obj.startBrowser();
		obj.printPDF();
		System.out.println("*********************");
		WebDriver obj1 = new Chrome();
		obj1.closeBrowser();
		obj1.startApplication();
		obj1.startBrowser();
		System.out.println(obj1.name);
		System.out.println(WebDriver.name);

	}

	public void printPDF() {
		System.out.println("Printing PDF");
	}

	public void startBrowser() {
		System.out.println("Starting the browser");

	}

	public void startApplication() {
		System.out.println("starting the application");
	}

	public void closeBrowser() {
		System.out.println("closing the browser");
	}

}
