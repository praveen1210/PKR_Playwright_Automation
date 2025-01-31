package object_repository;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class BasePage {
	public static void fileuploader() throws AWTException {
		Robot rs = new Robot();
		rs.delay(90); // Thread.sleep(5000);

		// Press CTRL+V
		rs.keyPress(KeyEvent.VK_CONTROL);
		rs.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		rs.keyRelease(KeyEvent.VK_V);
		rs.keyRelease(KeyEvent.VK_CONTROL);

		rs.keyPress(KeyEvent.VK_ENTER);
		rs.delay(90);
		rs.keyRelease(KeyEvent.VK_ENTER);
	}

}
