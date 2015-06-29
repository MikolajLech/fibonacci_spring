import ml.viewer.CustomerViewer;
import ml.viewer.CustomerViewerImpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerViewer viewer = appContext.getBean("customerViewer", CustomerViewerImpl.class);
		while(true) {
			viewer.setData();
			viewer.prtData();
		}
	}
}
