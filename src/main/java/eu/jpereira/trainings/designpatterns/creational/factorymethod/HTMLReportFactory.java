package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class HTMLReportFactory implements ReportFactory {

	@Override
	public Object createReport() {
		return new HTMLReport();
	}

}
