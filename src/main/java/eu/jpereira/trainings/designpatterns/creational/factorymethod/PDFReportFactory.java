package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class PDFReportFactory implements ReportFactory {

	@Override
	public Object createReport() {
		return new PDFReport();
	}

}
