package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class JSONReportFactory implements ReportFactory {

	@Override
	public Object createReport() {
		return new JSONReport();
	}

}
