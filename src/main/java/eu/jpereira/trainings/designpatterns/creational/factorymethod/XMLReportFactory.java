package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class XMLReportFactory implements ReportFactory {

	@Override
	public Object createReport() {
		return new XMLReport();
	}

}
