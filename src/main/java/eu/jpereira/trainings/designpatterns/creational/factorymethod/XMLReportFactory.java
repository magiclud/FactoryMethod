package eu.jpereira.trainings.designpatterns.creational.factorymethod;

public class XMLReportFactory implements ReportFactory {

	ReportData data;

	public XMLReportFactory(ReportData data) {
		this.data = data;
		createReport();
	}

	@Override
	public Report createReport() {
		return new XMLReport(data);
	}

}
